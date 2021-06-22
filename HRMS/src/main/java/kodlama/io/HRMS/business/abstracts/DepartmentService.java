package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.Department;

public interface DepartmentService {

	DataResult<List<Department>> getAll();
	Result add(Department department);
	Result delete(Department department);
}
