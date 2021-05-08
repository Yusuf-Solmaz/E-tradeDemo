package fifthTask.fifthTaskDemo.dataAccess.concretes;



import java.util.ArrayList;
import java.util.List;

import fifthTask.fifthTaskDemo.dataAccess.abstracts.IUserDao;
import fifthTask.fifthTaskDemo.entities.concretes.User;

public class UserDao implements IUserDao{

	
	List<User> users = new ArrayList<>();


	@Override
	public void add(User user) {
		
		users.add(user);
		System.out.println("Member added.");
	}


	@Override
	public boolean login(String email, String password) {
		
		for(User user : users) {
			if(email.equals(user.getEmail()) && password.equals(user.getPassword())){
				
				return true;
			}
		}
		return false;
		
	}


	@Override
	public  boolean emailChecking(User user) {
	
		for (User person : users) 
			
			if(person.getEmail().equals(user.getEmail())) {
				return false;
			}
		
		
		return true;
	}

}
