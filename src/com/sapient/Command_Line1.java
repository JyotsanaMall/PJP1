package com.sapient;

import java.util.ArrayList;

public class Command_Line1 {

	private ArrayList<Integer> nums;
	private int sum,min,max;
	double avg;
	
	public void setData(String args[]) {
		nums = new ArrayList<>();
		for (String arg:args) {
			nums.add(Integer.parseInt(arg));
		}
	}
	
	public void calData	() {
		min=Integer.MAX_VALUE;
		max=Integer.MIN_VALUE;
		sum=0;
		
		for(Integer it:nums) {
			sum+=it;
			if (it>max) {
				max=it;
			}
			if (it<min) {
				min=it;
			}
		}
		avg=(sum/nums.size());
	}
	
	public void displayData() {
		System.out.printf("Sum : %d\nAvg : %f\nBiggest : %d\nSmallest : %d",sum,avg,max,min);
	}
	
	
}