package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.JobAdvertisementService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.JobAdvertisementDao;
import kodlama.io.HRMS.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {

		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş İlanı Eklendi");
	}

	@Override
	public Result delete(JobAdvertisement jobAdvertisement) {

		this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("İş İlanı Kaldırıldı");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(),"Tüm iş ilanları görüntülendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive(boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActive(isActive),"Veriler başarıyla getirildi.");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveOrderByApplicationDeadline(boolean isActive) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActiveOrderByApplicationDeadline(isActive));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_CompanyName(boolean isActive,
			String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActiveAndEmployer_CompanyName(isActive, companyName));
	}


}