package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.JobSeekerEducation;

public interface JobSeekerEducationService {

	DataResult<List<JobSeekerEducation>> getAll();
	Result add(JobSeekerEducation jobSeekerEducation);
	Result delete(JobSeekerEducation jobSeekerEducation);
	
	DataResult<List<JobSeekerEducation>> getAllByJobSeekerIdOrderByGraduationDateDesc(int jobSeekerId);
}
