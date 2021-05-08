package fifthTask.fifthTaskDemo.entities.concretes;


import fifthTask.fifthTaskDemo.entities.abstracts.IEntities;



public class User  implements IEntities {

	private String name;
	private String lastName;
	private String email;
	private String password;
	

	public User(String name, String lastName, String email, String password) {
		setEmail(email);
		setLastName(lastName);
		setName(lastName);
		setPassword(password);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		
		
		this.name = name;
	}
	


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		
		
		this.lastName = lastName;
	}
	


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		
		this.email = email;
	}


	public void setPassword(String password) {
		
		
	
		this.password = password;
	
	}
	public String getPassword() {
		return password;
	}		
	
	
}
