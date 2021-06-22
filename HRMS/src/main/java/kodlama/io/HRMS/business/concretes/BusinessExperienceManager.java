package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.BusinessExperienceService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.BusinessExperienceDao;
import kodlama.io.HRMS.entities.concretes.BusinessExperience;

@Service
public class BusinessExperienceManager implements BusinessExperienceService {

	private BusinessExperienceDao businessExperienceDao;

	@Autowired
	public BusinessExperienceManager(BusinessExperienceDao businessExperienceDao) {
		super();
		this.businessExperienceDao = businessExperienceDao;
	}

	@Override
	public DataResult<List<BusinessExperience>> getAll() {
		return new SuccessDataResult<List<BusinessExperience>>(this.businessExperienceDao.findAll());
	}

	@Override
	public Result add(BusinessExperience businessExperience) {
	

		this.businessExperienceDao.save(businessExperience);
		return	new SuccessResult("JobExperience added");
	}
	
	@Override
	public Result delete(BusinessExperience businessExperience) {
		businessExperienceDao.delete(businessExperience);
		return new SuccessResult("JobExperience deleted");
		
	}

	@Override
	public DataResult<List<BusinessExperience>> getAllByJobSeekerIdOrderByTerminationDateDesc(int jobSeekerId) {
		return new SuccessDataResult<List<BusinessExperience>>(businessExperienceDao.getAllByJobSeeker_IdOrderByTerminationDateDesc(jobSeekerId));
	}
}
