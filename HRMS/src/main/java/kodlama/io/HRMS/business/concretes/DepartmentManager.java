package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.DepartmentService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.ErrorResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.DepartmentDao;
import kodlama.io.HRMS.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService {

	private DepartmentDao departmentDao;

	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}

	@Override
	public DataResult<List<Department>> getAll() {
		return new SuccessDataResult<List<Department>>(this.departmentDao.findAll());
	}

	@Override
	public Result add(Department department) {
		Result result = null;

		if (departmentDao.existsByDepartmentName(department.getDepartmentName())) {
			result = new ErrorResult("Department  already defined");
		} else {
			this.departmentDao.save(department);
			result = new SuccessResult("Department  added");
		}

		return result;
	}
	
	@Override
	public Result delete(Department department) {
		departmentDao.delete(department);
		return new SuccessResult("Department deleted");
		
	}
}
