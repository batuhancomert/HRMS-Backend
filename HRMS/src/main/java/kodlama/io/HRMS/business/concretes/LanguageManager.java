package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.LanguageService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.ErrorResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.core.utilities.result.SuccessDataResult;
import kodlama.io.HRMS.core.utilities.result.SuccessResult;
import kodlama.io.HRMS.dataAccess.abstracts.LanguageDao;
import kodlama.io.HRMS.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;

	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll());
	}

	@Override
	public Result add(Language language) {
		Result result = null;

		if (languageDao.existsByLanguageName(language.getLanguageName())) {
			result = new ErrorResult("Language already defined");
		} else {
			this.languageDao.save(language);
			result = new SuccessResult("Language added");
		}

		return result;
	}
	
	@Override
	public Result delete(Language language) {
		languageDao.delete(language);
		return new SuccessResult("Language deleted");
		
	}
}
