package fifthTask.fifthTaskDemo.core;

import fifthTask.fifthTaskDemo.entities.concretes.User;
import googleMailService.GoogleMailService;

public class GoogleServiceAdapter implements IMailService{

	@Override
	public void mailVerification(User user) {
		GoogleMailService mailService = new GoogleMailService();
		mailService.verification();
		
	}

}
