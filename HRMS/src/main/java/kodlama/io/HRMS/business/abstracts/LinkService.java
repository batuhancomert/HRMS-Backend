package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.Link;

public interface LinkService {

	DataResult<List<Link>> getAll();
	Result add(Link link);
	Result delete(Link link);
}
