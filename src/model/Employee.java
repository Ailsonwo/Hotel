package model;

public class Employee {

	private int id;
	private String login;
	private String password;
	
	Employee(String login, String password, int id){
		this.login = login;
		this.password = password;
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isEqual(String login, String password) {
		if(!this.login.equals(login))
			return false;
		if(!this.password.equals(password))
			return false;
		return true;
	}
}
