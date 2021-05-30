package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.adapters.ValidationService;
import kodlama.io.HRMS.business.abstracts.JobSeekerService;
import kodlama.io.HRMS.core.abstracts.EmailValidationService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.ErrorResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.JobSeekerDao;
import kodlama.io.HRMS.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private ValidationService validationService;
	private EmailValidationService emailValidationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,ValidationService validationService,EmailValidationService emailValidationService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.validationService = validationService;
		this.emailValidationService = emailValidationService;
		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(),"JobSeekers Listed");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		if(validationService.checkIfRealPerson(jobSeeker )
				&& jobSeekerDao.existsByNationalityId(jobSeeker.getNationalityId())
				&& jobSeekerDao.existsByEmail(jobSeeker.getEmail())) {
			
			if(emailValidationService.sendEmail(jobSeeker.getEmail())) {
				this.jobSeekerDao.save(jobSeeker);
				return new SuccessResult("JobSeekers Added");
			}else {
			return new ErrorResult("Email verification is not successful");
	    } 
		
		}
		return new ErrorResult("JobSeekers Not Added");
	}
}
