package com.sapient;

import java.util.Scanner;

public class Calculator extends Inputs {
	public static Scanner scanner = new Scanner(System.in);
	
	public void getInputs() {
		System.out.println("Enter two numbers");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		setNum1(a);
		setNum2(b);
	}
	
	public void Add() {
		setRes(num1+num2);
	}
	
	public void Subtract() {
		setRes(num1-num2);
	}
	
	public void Multiply() {
		setRes(num1*num2);
	}
	
	public void Divide() {
		setRes(num1/num2);
	}
	
	public void Modulus() {
		setRes(num1%num2);
	}
}
