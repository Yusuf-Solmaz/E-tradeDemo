package fifthTask.fifthTaskDemo.dataAccess.abstracts;


import fifthTask.fifthTaskDemo.entities.concretes.User;

public interface IUserDao {

	void add(User user);
	boolean login(String email,String password);
    boolean  emailChecking(User user);
	
	
	
}
