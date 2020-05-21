package com.sapient;

public class Problem{
	
	public static void main(String[] args) {
		Command_Line1 obj = new Command_Line1();
		obj.setData(args);
		obj.calData();
		obj.displayData();
		
		
		KeyRead_Line2 obj2 = new KeyRead_Line2();
		obj2.readInput();
		obj2.display();
		obj2.sort();
		obj2.display();
		obj2.find(12);
	}
}
