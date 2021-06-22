package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.EducationService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.ErrorResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.EducationDao;
import kodlama.io.HRMS.entities.concretes.Education;

@Service
public class EducationManager implements EducationService {

	private EducationDao educationDao;

	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll());
	}

	@Override
	public Result add(Education education) {
		Result result = null;

		if (educationDao.existsByEducationName(education.getEducationName())) {
			result = new ErrorResult("Education  already defined");
		} else {
			this.educationDao.save(education);
			result = new SuccessResult("Education  added");
		}

		return result;
	}
	
	@Override
	public Result delete(Education education) {
		educationDao.delete(education);
		return new SuccessResult("Education deleted");
		
	}
}
