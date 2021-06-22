package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.JobSeekerEducationService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.JobSeekerEducationDao;
import kodlama.io.HRMS.entities.concretes.JobSeekerEducation;

@Service
public class JobSeekerEducationManager implements JobSeekerEducationService {

	private JobSeekerEducationDao jobSeekerEducationDao;

	@Autowired
	public JobSeekerEducationManager(JobSeekerEducationDao jobSeekerEducationDao) {
		super();
		this.jobSeekerEducationDao = jobSeekerEducationDao;
	}

	@Override
	public DataResult<List<JobSeekerEducation>> getAll() {
		return new SuccessDataResult<List<JobSeekerEducation>>(this.jobSeekerEducationDao.findAll());
	}

	@Override
	public Result add(JobSeekerEducation jobSeekerEducation) {
	

		this.jobSeekerEducationDao.save(jobSeekerEducation);
		return	new SuccessResult("JobSeekerEducation added");
	}
	
	@Override
	public Result delete(JobSeekerEducation jobSeekerEducation) {
		jobSeekerEducationDao.delete(jobSeekerEducation);
		return new SuccessResult("JobSeekerEducation deleted");
		
	}

	@Override
	public DataResult<List<JobSeekerEducation>> getAllByJobSeekerIdOrderByGraduationDateDesc(int jobSeekerId) {
		
		return new SuccessDataResult<List<JobSeekerEducation>>(jobSeekerEducationDao.getAllByJobSeeker_IdOrderByGraduationDateDesc(jobSeekerId));
	
	}
}
