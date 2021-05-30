package kodlama.io.HRMS.business.abstracts;

import java.util.List;



import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.Employer;


public interface EmployerService {

	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
}
