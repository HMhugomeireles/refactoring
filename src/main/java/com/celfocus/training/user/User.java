package com.celfocus.training.user;

import java.util.Date;


public class User {

	public User(String nameOfUser, Date birthDate, boolean ifUserOlder) {
		super();
		this.nameOfUser = nameOfUser;
		this.birthDate = birthDate;
		this.ifUserOlder = ifUserOlder;
	}

	private String nameOfUser; // nome


	private Date birthDate; // data de nascimento


	private boolean ifUserOlder; // se usuário é maior de idade


	public String getNameOfUser() {
		return nameOfUser;
	}


	public void setNameOfUser(String nameOfUser) {
		this.nameOfUser = nameOfUser;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public boolean getIfUserOlder() {
		return ifUserOlder;
	}


	public void setIfUserOlder(boolean ifUserOlder) {
		this.ifUserOlder = ifUserOlder;
	}


}