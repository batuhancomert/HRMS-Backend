package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.Education;

public interface EducationService {

	DataResult<List<Education>> getAll();
	Result add(Education education);
	Result delete(Education education);
}
