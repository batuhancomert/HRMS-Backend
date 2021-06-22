package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.Skill;

public interface SkillService {

	DataResult<List<Skill>> getAll();
	Result add(Skill skill);
	Result delete(Skill skill);
}
