package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	
	Result delete(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>> getAll();
	
	
	DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive);
	
	DataResult<List<JobAdvertisement>> getByOrderByApplicationDeadline();
	
	DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_companyName(boolean status, String companyName);
	 
	 
}
	
