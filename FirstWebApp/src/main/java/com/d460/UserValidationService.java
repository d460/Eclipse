package com.d460;

public class UserValidationService {
	
	public boolean isUserValid(String user, String pass){
		if(user.equals("dago") && pass.equals("somepass"))
			return true;
		
		return false;
	}

}
