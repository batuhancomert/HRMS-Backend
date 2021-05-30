package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.SystemWorkerService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.SystemWorkerDao;
import kodlama.io.HRMS.entities.concretes.SystemWorker;

@Service
public class SystemWorkerManager implements SystemWorkerService {

	private SystemWorkerDao systemWorkerDao;
	
	@Autowired
	public SystemWorkerManager(SystemWorkerDao systemWorkerDao) {
		super();
		this.systemWorkerDao = systemWorkerDao;
	}

	@Override
	public DataResult<List<SystemWorker>> getAll() {
		return new SuccessDataResult<List<SystemWorker>>
		(this.systemWorkerDao.findAll(),"SystemWorkers Listed");
	}

	@Override
	public Result add(SystemWorker systemWorker) {
		this.systemWorkerDao.save(systemWorker);
		return new SuccessResult("SystemWorkers Added");
	}

}
