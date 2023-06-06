package com.gl.emailservice;

import com.gl.emaiapp.model.Employee;

public interface EmailCredentialServices {
	
	public String generateEmailAddress(Employee emp, String department);
	
	public String generatePassword();
	
	public void showCredentials(Employee employee,String department);
	

}

