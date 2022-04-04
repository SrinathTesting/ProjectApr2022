package org.sample;

public class clientDetails {

	private void clientName() {
	
		System.out.println("Client name is : Vinoth");
		

	}
	
	private void clientId() {
	System.out.println("Client Id is : 2241");
	}
	
	public static void main(String[] args) {
		clientDetails c=new clientDetails();
		c.clientId();
		c.clientName();
		
	EmployeeDetails e=new EmployeeDetails();
	e.employeeId();
	e.employeeName();
			
		int age =24;
		System.out.println("The age of employee is:"+age);
		
	
	}
	
}
