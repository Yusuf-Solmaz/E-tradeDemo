package fifthTask.fifthTaskDemo.business.abstracts;

import fifthTask.fifthTaskDemo.entities.concretes.User;

public interface IAuthService {

	boolean isEmailValid(String email);
	boolean infoChecking(User user);
	boolean passwordChecking(User user);
}
