package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.UserService;
import kodlama.io.HRMS.core.utilities.result.DataResult;
import kodlama.io.HRMS.core.utilities.result.Result;
import kodlama.io.HRMS.entities.concretes.User;

@Service
public class UserManager implements UserService {

	@Override
	public DataResult<List<User>> getAll() {
		
		return null;
	}

	@Override
	public Result add(User user) {
		
		return null;
	}

}
