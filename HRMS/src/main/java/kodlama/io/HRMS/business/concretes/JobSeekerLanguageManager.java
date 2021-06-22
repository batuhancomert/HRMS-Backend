package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.JobSeekerLanguageService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.JobSeekerLanguageDao;
import kodlama.io.HRMS.entities.concretes.JobSeekerLanguage;

@Service
public class JobSeekerLanguageManager implements JobSeekerLanguageService {

	private JobSeekerLanguageDao jobSeekerLanguageDao;

	@Autowired
	public JobSeekerLanguageManager(JobSeekerLanguageDao jobSeekerLanguageDao) {
		super();
		this.jobSeekerLanguageDao = jobSeekerLanguageDao;
	}

	@Override
	public DataResult<List<JobSeekerLanguage>> getAll() {
		return new SuccessDataResult<List<JobSeekerLanguage>>(this.jobSeekerLanguageDao.findAll());
	}

	@Override
	public Result add(JobSeekerLanguage jobSeekerLanguage) {
	

		this.jobSeekerLanguageDao.save(jobSeekerLanguage);
		return	new SuccessResult("JobSeekerLanguage added");
	}
	
	@Override
	public Result delete(JobSeekerLanguage jobSeekerLanguage) {
		jobSeekerLanguageDao.delete(jobSeekerLanguage);
		return new SuccessResult("JobSeekerLanguage deleted");
		
	}
}
