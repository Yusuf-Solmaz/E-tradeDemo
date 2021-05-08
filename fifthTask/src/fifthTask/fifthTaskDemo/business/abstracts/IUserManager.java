package fifthTask.fifthTaskDemo.business.abstracts;

import fifthTask.fifthTaskDemo.entities.concretes.User;

public interface IUserManager {

	void register(User user);
	void login(String email,String password);
}
