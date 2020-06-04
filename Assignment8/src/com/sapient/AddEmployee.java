package com.sapient;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	public List<Employee> list;

	public AddEmployee() {
		this.list = new ArrayList<>();
	}
	
	Boolean isInvalidString(String str) {
		return (str == "" || str == null);
	}
	
	Boolean isInvalidId(int id) {
		return (id < 0);
	}
	
	void addEmployee(Employee ob) {
		if(ob == null || isInvalidString(ob.getCity()) || isInvalidString(ob.getName()) 
				|| isInvalidId(ob.getId()))
			throw new IllegalArgumentException();
		
		list.add(ob);
	}
	
	Employee getEmployee(int id) {
		for(Employee emp : list) {
			if(emp.getId() == id)
				return emp;
		}
		return null;
	}
}
