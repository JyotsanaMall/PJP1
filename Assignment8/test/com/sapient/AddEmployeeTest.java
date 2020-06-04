package com.sapient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

class AddEmployeeTest {
	
	private AddEmployee addEmployee;
	private Employee employee;
	
	@Before
	public void setUp() throws Exception {
		addEmployee = new AddEmployee();
		employee = new Employee(1,"name","city");
		addEmployee.addEmployee(employee);
	}

	
	@Test(expected = IllegalArgumentException.class)	//id is invalid
	public void addEmployee_InvalidId() {
		employee = new Employee(-9,"name","city");
		addEmployee.addEmployee(employee);
	}
	
	
	@Test(expected = NullPointerException.class)		//employee is null
	public void addEmployee_NullCase() {
		addEmployee.addEmployee(employee);
	}
	
	
	@Test(expected = NullPointerException.class) 		//str is null
	public void addEmployee_NameNull() {
		employee = new Employee(2,null,"city");
		addEmployee.addEmployee(employee);
	}
	
	
	@Test(expected = NullPointerException.class)		//str is empty
	public void addEmployee_NameEmpty() {
		employee = new Employee(15,"name","");
		addEmployee.addEmployee(employee);
	}
	
	
	@Test												//add employee to list
	public void testAddEmployee() {
		assertEquals(1, addEmployee.list.size());
	}
	
	
	@Test												//employee present
	public void testGetEmployee_ValidId() {
		Employee res = addEmployee.getEmployee(1);
		assertEquals(employee, res);
	}
	
	
	@Test												//employee not present
	public void testGetEmployee_InvalidId() {
		Employee res = addEmployee.getEmployee(1);
		assertNull(res);
	}
}
