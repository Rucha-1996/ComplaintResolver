package com.complaintresolver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserModel {
	@Id
	@GeneratedValue
	private int User_id;
	private String User_FullName;
	private String User_Password;
	private int User_MobileNumber;
	private String User_Address;
	private String User_Email;
	
	public String getUser_FullName() {
		return User_FullName;
	}
	public void setUser_FullName(String user_FullName) {
		User_FullName = user_FullName;
	}
	public String getUser_Password() {
		return User_Password;
	}
	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}
	public int getUser_MobileNumber() {
		return User_MobileNumber;
	}
	public void setUser_MobileNumber(int user_MobileNumber) {
		User_MobileNumber = user_MobileNumber;
	}
	public String getUser_Address() {
		return User_Address;
	}
	public void setUser_Address(String user_Address) {
		User_Address = user_Address;
	}
	public String getUser_Email() {
		return User_Email;
	}
	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}
	public UserModel(String user_FullName, String user_Password, int user_MobileNumber, String user_Address,
			String user_Email) {
		super();
		User_FullName = user_FullName;
		User_Password = user_Password;
		User_MobileNumber = user_MobileNumber;
		User_Address = user_Address;
		User_Email = user_Email;
	}
	
}
