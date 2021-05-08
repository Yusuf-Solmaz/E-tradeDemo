package fifthTask.fifthTaskDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fifthTask.fifthTaskDemo.business.abstracts.IAuthService;
import fifthTask.fifthTaskDemo.entities.concretes.User;

public class AuthService implements IAuthService{

	@Override
	public boolean isEmailValid(String email) {
		 String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		    CharSequence inputStr = email;
		 
		    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(inputStr);
		    return matcher.matches();
		
	}
	
	public boolean infoChecking(User user) {
		if(user.getName().length()<3 && user.getLastName().length()<3) {
			return false;
		}
		return true;
	}

	@Override
	public boolean passwordChecking(User user) {
		if(user.getPassword().length()<6) {
			return false;
		}
		return true;
	}

}
