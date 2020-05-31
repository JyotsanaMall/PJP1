package com.sapient;

public class Int_Arr_ProcessRunner {

	public static void main(String[] args) {
		Int_Arr_Process obj = new Int_Arr_Process(10);
		obj.read();
		obj.display();
		obj.largestSmallest();
		obj.secondBiggest();
		
		 Int_Arr_Process copy_obj = new Int_Arr_Process(obj); 
		 copy_obj.display();
	}

}
