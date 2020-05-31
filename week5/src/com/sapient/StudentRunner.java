package com.sapient;

public class StudentRunner {
	
	public static void main(String[] arg) {
		StudentBusinessObject studentList = new StudentBusinessObject();
		
		System.out.println("Enter number of students:");
		int n = Read.scanner.nextInt();
		for(int i=0; i<n; i++)
			studentList.read();
		
		studentList.displayAll();
		
		System.out.println("Enter city:");
		String city = Read.scanner.next();
		studentList.displayByCity(city);
		
		studentList.sortByName();
		studentList.sortByCity();
		
		System.out.println("Enter id to be searched:");
		int id = Read.scanner.nextInt();
		studentList.findById(id);;
	}
}
