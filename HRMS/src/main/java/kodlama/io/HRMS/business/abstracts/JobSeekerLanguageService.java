package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.JobSeekerLanguage;

public interface JobSeekerLanguageService {

	DataResult<List<JobSeekerLanguage>> getAll();
	Result add(JobSeekerLanguage jobSeekerLanguage);
	Result delete(JobSeekerLanguage jobSeekerLanguage);
}
