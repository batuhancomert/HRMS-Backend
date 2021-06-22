package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.CoverLetter;

public interface CoverLetterService {

	DataResult<List<CoverLetter>> getAll();
	Result add(CoverLetter coverLetter);
	Result delete(CoverLetter coverLetter);
}
