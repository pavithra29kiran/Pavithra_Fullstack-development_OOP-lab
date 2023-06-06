package com.gl.emaiapp.main;

import java.util.Scanner;
import com.gl.emaiapp.model.Employee;
import com.gl.emailservice.EmailCredentialServices;
import com.gl.emailservice.EmailCredentialServiceImpl;

public class EmailApp {
	public static void main(String[] args) {
		EmailCredentialServiceImpl service=new EmailCredentialServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First name");
		String fn=sc.next();
		System.out.println("Enter your Last name");
		String ln=sc.next();
	   Employee employee = new Employee(fn, ln);
	    
	    System.out.println("Please enter the department");
	    System.out.println("1. Technical ");
	    System.out.println("2. Admin");
	    System.out.println("3. Human Resource");
	    System.out.println("4. Legal");
	    String department = null;
	    int choice =sc.nextInt(); 
	    
		switch (choice) {
	    case 1:
	    	department = "tech";
	    	break;
	    
	    case 2:
	    	department = "admin";
	    	break;
	   
	    case 3:
	    	department ="hr";
	    	break;
	    	
	    case 4:
	    	department = "legal";
	    	break;
	    	
	    default:
	    	System.out.println("Enter the valid option");
	    	break;
	    	 }
		
		  if(department!=null){
	    String generatedPassword = service.generatePassword();
	    String generatedEmail = service.generateEmailAddress(employee, department);
	    service.showCredentials(employee, department);
	    }
	    else 
	    {
	  System.out.println("Please enter department again");  	
	    }
	    
	    sc.close();
	   	}
}
