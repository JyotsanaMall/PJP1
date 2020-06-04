package com.sapient;

public class Number {
	public int checkPrime(int x) {
		if(x < 0)
			throw new IllegalArgumentException();
		
		else if(x == 0 || x == 1)
			return 0;
		
		for(int i=2; i<=Math.sqrt(x); i++)
			if(x % i == 0)
				return 0;
		return 1;
	}
	
	public Boolean checkArmstrong(int x) {
		if(x < 0)
			throw new IllegalArgumentException();
		
		int num = x, sum = 0;
		while(num != 0) {
			sum += Math.pow(num % 10, 3);
			num /= 10;
		}
		return (x == sum);
	}
	
	public Boolean checkPalindrome(int x) {
		if(x < 0)
			throw new IllegalArgumentException();
		
		String str = Integer.toString(x);
		int s = 0, e = str.length()-1;
		while(s < e) {
			if(str.charAt(s) != str.charAt(e))
				return false;
			s++;
			e--;
		}
		return true;
	}
}
