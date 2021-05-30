package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.SystemWorker;

public interface SystemWorkerService {

	DataResult<List<SystemWorker>> getAll();
	Result add(SystemWorker systemWorker);
}
