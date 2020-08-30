package entity;

import java.io.Serializable;

public class RegistrationInfo implements Serializable {

	private static final long serialVersionUID = 6404972492924168892L;
	private String login;
	private String password;
	private String name;
	private String surname;
	private int yearBirthday;
	
	public RegistrationInfo(){};
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
		
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setYearBirthday(String yearBirthday) {
		this.yearBirthday = Integer.parseInt(yearBirthday);
	}
	
	public int getYearBirthday() {
		return yearBirthday;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
