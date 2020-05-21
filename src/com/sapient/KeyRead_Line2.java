package com.sapient;

import java.util.ArrayList;

public class KeyRead_Line2 {
	ArrayList<Integer> arr;
	int n;
	
	public void readInput() {
		System.out.println("Enter Number of numbers : ");
		n = Read.scanner.nextInt();
		arr = new ArrayList<>();
		System.out.println("Enter "+n+" numbers");
		for (int i = 0; i < n; i++) {
			arr.add(Read.scanner.nextInt());
		}
	}
	
	public void display() {
		System.out.println();
		for (Integer integer : arr) {
			System.out.print(integer+" ");
		}
	}
	
	public void sort() {
		arr.sort(null);
	}
	public void find(int num) {
		for (Integer integer : arr) {
			if (integer==num) {
				System.out.println("\nFound "+num);
				return;
			}
		}
		System.out.println("\nNot found "+num);
	}
}

