package kodlama.io.HRMS.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import kodlama.io.HRMS.core.abstracts.EmailValidationService;

@Service
public class EmailValidationManager implements EmailValidationService {

	

	@Override
	public boolean sendEmail(String email) {
		if(checkEmail(email)) {
			return true;
		}
		return false;
	}
	
	
	public boolean checkEmail(String email) {
		String regex = "^[a-z0-9._+-]+@[a-z0-9.-]+.(com|org|net|gov)(.[a-z]{2})?$";
		Pattern pattern = Pattern.compile(regex);
		Matcher control = pattern.matcher(email);
		if(control.matches()) {
			return true;
		}else {
			return false;
		}
	}


}
