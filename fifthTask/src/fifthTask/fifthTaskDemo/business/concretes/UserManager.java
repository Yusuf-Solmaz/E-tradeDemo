package fifthTask.fifthTaskDemo.business.concretes;


import fifthTask.fifthTaskDemo.business.abstracts.IAuthService;
import fifthTask.fifthTaskDemo.business.abstracts.IUserManager;
import fifthTask.fifthTaskDemo.core.IMailService;
import fifthTask.fifthTaskDemo.dataAccess.abstracts.IUserDao;
import fifthTask.fifthTaskDemo.entities.concretes.User;

public class UserManager implements IUserManager{

	private IUserDao userDao;
	private IAuthService authService;
	IMailService mailService;
	
	
	public UserManager(IUserDao userDao, IAuthService authService, IMailService mailService) {
		
		this.userDao = userDao;
		this.authService = authService;
		this.mailService = mailService;
	}

	@Override
	public void register(User user) {
		if(!userDao.emailChecking(user)) {
			System.out.println("Registration failed. "+ user.getEmail()+ " already exist");
			return;
		}
		if(!authService.isEmailValid(user.getEmail())) {
			System.out.println("Wrong email type.Registration failed.");
			return;
		}
		if(!authService.infoChecking(user)) {
			System.out.println("Your name or last name must be at least 2 characters");
			return;
		}
		if(!authService.passwordChecking(user)) {
			System.out.println("Your password must be at least 6 characters");
			return;
		}
		
		mailService.mailVerification(user);
		userDao.add(user);
	
	}

	@Override
	public void login(String email, String password) {
		if(userDao.login(email, password)) {
			System.out.println("Login successful.");
		}
		else {
			System.out.println("Wrong email or password.");
		}
		
		
	}

	
	


}
