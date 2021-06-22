package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.BusinessExperience;

public interface BusinessExperienceService {

    DataResult<List<BusinessExperience>> getAll();
	
	Result add(BusinessExperience businessExperience);
	Result delete(BusinessExperience businessExperience);
	
	DataResult<List<BusinessExperience>> getAllByJobSeekerIdOrderByTerminationDateDesc(int jobSeekerId);
}
