package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.JobSeekerSkillService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.JobSeekerSkillDao;
import kodlama.io.HRMS.entities.concretes.JobSeekerSkill;

@Service
public class JobSeekerSkillManager implements JobSeekerSkillService {

	private JobSeekerSkillDao jobSeekerSkillDao;

	@Autowired
	public JobSeekerSkillManager(JobSeekerSkillDao jobSeekerSkillDao) {
		super();
		this.jobSeekerSkillDao = jobSeekerSkillDao;
	}

	@Override
	public DataResult<List<JobSeekerSkill>> getAll() {
		return new SuccessDataResult<List<JobSeekerSkill>>(this.jobSeekerSkillDao.findAll());
	}

	@Override
	public Result add(JobSeekerSkill jobSeekerSkill) {
	

		this.jobSeekerSkillDao.save(jobSeekerSkill);
		return	new SuccessResult("JobSeeker Skill added");
	}
	
	@Override
	public Result delete(JobSeekerSkill jobSeekerSkill) {
		jobSeekerSkillDao.delete(jobSeekerSkill);
		return new SuccessResult("JobSeeker Skill deleted");
		
	}
}
