package kodlama.io.HRMS.business.abstracts;

import java.util.List;

import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.Language;

public interface LanguageService {

	DataResult<List<Language>> getAll();
	Result add(Language language);
	Result delete(Language language);
}
