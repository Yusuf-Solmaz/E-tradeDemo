package fifthTask.fifthTaskDemo;

import fifthTask.fifthTaskDemo.business.concretes.AuthService;
import fifthTask.fifthTaskDemo.business.concretes.UserManager;
import fifthTask.fifthTaskDemo.core.GoogleServiceAdapter;
import fifthTask.fifthTaskDemo.dataAccess.concretes.UserDao;
import fifthTask.fifthTaskDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		 
		
		User user = new User("Yusuf", "Solmaz", "yusuf@gmail.com","yusuf123");
		
		User user1 = new User("Enes", "Abdullah", "enes@gmail.com","245463");
		
		
		UserManager userManager = new UserManager(new UserDao(),new AuthService(),new GoogleServiceAdapter() );
		
		
		
		userManager.register(user);
		userManager.login("yusuf@gmail.com","yusuf123");// correct entry
		
		
		userManager.register(user1);
		userManager.login("enes@gmail.com","263"); // incorrect entry
	
}
}
