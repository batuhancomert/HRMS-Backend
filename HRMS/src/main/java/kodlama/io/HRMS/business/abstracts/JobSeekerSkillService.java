package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.JobSeekerSkill;

public interface JobSeekerSkillService {

	DataResult<List<JobSeekerSkill>> getAll();
	Result add(JobSeekerSkill jobSeekerSkill);
	Result delete(JobSeekerSkill jobSeekerSkill);
}
