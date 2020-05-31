package com.sapient;

import java.util.ArrayList;
import java.util.Collections;

public class StudentBusinessObject {
	private ArrayList<Student> student;
	
	public StudentBusinessObject() {
		student = new ArrayList<>();
	}
	
	public void read() {
		System.out.println("Enter student id, name and city: ");
		
		int id = Read.scanner.nextInt();
		String name = Read.scanner.nextLine();
		String city = Read.scanner.nextLine();
		Student st = new Student(id, name, city);
		
		student.add(st);
	}
	
	public void display(Student student) {
		System.out.println("Id: " +student.getId()+
						"\nName: " +student.getName()+
						"\nCity: " +student.getCity());
	}
	
	public void displayAll() {
		for(Student st: student)
			display(st);
	}
	
	public void displayByCity(String city) {
		for(Student st: student) {
			if(city.equalsIgnoreCase(st.getCity()))
				display(st);
		}
	}
	
	public void sortByName() {
		Collections.sort(student, (a,b) -> {return a.getName().compareTo(b.getName());});
		displayAll();
	}
	
	public void sortByCity() {
		student.sort(new CompareByCity());
		displayAll();
	}
	
	public void findById(int id) {
		try {
			for(Student st: student) {
				if(st.getId() == id) {
					display(st);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Student not found");
			e.printStackTrace();
		}
	}
}
