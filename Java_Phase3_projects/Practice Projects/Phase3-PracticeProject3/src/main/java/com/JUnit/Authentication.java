package com.JUnit;

public class Authentication {

	public boolean validate(String username ,String password) {
	
		if(username.equals("Savitha")&& password.equals("Savitha2@")) {
			
			System.out.println("Authentication Succesful");
			return true;}
			
		else {
			System.out.println("Authentication failed");
			return false;
			
		}
	}
}
