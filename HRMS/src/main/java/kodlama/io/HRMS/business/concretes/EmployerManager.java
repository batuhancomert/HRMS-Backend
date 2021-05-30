package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.EmployerService;
import kodlama.io.HRMS.core.abstracts.EmailValidationService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.ErrorResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.EmployerDao;
import kodlama.io.HRMS.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private EmailValidationService emailValidationService;

	@Autowired
	public EmployerManager(EmployerDao employerDao, EmailValidationService emailValidationService) {
		super();
		this.employerDao = employerDao;
		this.emailValidationService = emailValidationService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Employers Listed");
	}

	@Override
	public Result add(Employer employer) {
		if(employerDao.existsByEmail(employer.getEmail())
				&&employer.getCompanyWebSite().contains(employer.getEmail().substring(employer.getEmail().indexOf("@")+1,employer.getEmail().indexOf(".")))) {
			
			if(emailValidationService.sendEmail(employer.getEmail())) {
				this.employerDao.save(employer);
				return new SuccessResult("Employer Added");
			}else {
			return new ErrorResult("Email verification is not successful");
	    } 
		
		}
		return new ErrorResult("Employer Not Added");
		
	
}

}
