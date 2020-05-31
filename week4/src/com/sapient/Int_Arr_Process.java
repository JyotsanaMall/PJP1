package com.sapient;

import java.util.Arrays;

public class Int_Arr_Process {
	private int[] arr;
	
	public Int_Arr_Process() {
		arr = new int[10];
	}
	
	public Int_Arr_Process(int size) {
		arr = new int[size];
	}
	
	public Int_Arr_Process(int[] arr) {
		this.arr = new int[arr.length];
		for(int i=0; i<arr.length; i++)
			this.arr[i] = arr[i];
	}
	
	public Int_Arr_Process(Int_Arr_Process obj) {
		this.arr = new int[obj.arr.length];
		for(int i=0; i<this.arr.length; i++)
			this.arr[i] = obj.arr[i];
	}
	
	public void read() {
		System.out.println("Enter numbers:");
		for(int i=0; i<arr.length; i++) {
			int val = Read.scanner.nextInt();
			arr[i] = val;
		}
	}
	
	public void display() {
		System.out.println("Horizontal display :");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println("\n\nVertical display :");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
	
	public void sort() {
		Arrays.sort(arr);
	}
	
	public void largestSmallest() {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("Max Value: "+max);
		System.out.println("Min Value: "+min);
	}
	
	public void sum() {
		int sum = 0;
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		System.out.println("Sum Value: "+sum);
	}
	
	public void secondBiggest() {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				secondMax = max;
				max = arr[i];
			}
			
			else if(max > arr[i] && secondMax < arr[i])
				secondMax = arr[i];
		}
		System.out.println("Second Biggest Value: "+secondMax);
	}
}
