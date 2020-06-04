package com.sapient;

public class ScientificCalculator extends Calculator{
	public void squareNum1() {
		setRes(Math.pow(getNum1(), 2));
	}
	
	public void squareNum2() {
		setRes(Math.pow(getNum2(), 2));
	}
}
