package org.sample1;

public class StudentDetails extends CollegeDetails {

	private void studentName() {
System.out.println("Student name: Siva");

	}
	
	private void studentId() {
	System.out.println("Student Id:4456");

	}
	public static void main(String[] args) {
		
		StudentDetails s=new StudentDetails();
		s.studentId();
		s.studentName();
		s.collegeID();
		s.collegeName();
		
	}
}
