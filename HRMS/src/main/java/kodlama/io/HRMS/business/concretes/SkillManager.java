package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.SkillService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.ErrorResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.SkillDao;
import kodlama.io.HRMS.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService {

	private SkillDao skillDao;

	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		return new SuccessDataResult<List<Skill>>(this.skillDao.findAll());
	}

	@Override
	public Result add(Skill skill) {
		Result result = null;

		if (skillDao.existsBySkillName(skill.getSkillName())) {
			result = new ErrorResult("Skill  already defined");
		} else {
			this.skillDao.save(skill);
			result = new SuccessResult("Skill  added");
		}

		return result;
	}
	
	@Override
	public Result delete(Skill skill) {
		skillDao.delete(skill);
		return new SuccessResult("Skill deleted");
		
	}
}
