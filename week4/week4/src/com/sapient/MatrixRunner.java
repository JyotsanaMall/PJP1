package com.sapient;

public class MatrixRunner {

	public static void main(String[] args) {
		Matrix matrix1 = new Matrix(4,5);		
		Matrix matrix2 = new Matrix(5,4); 
		matrix1.read();
		matrix2.read(); 
		
		Matrix addition = matrix1.add(matrix2);
		if(addition != null)
			addition.display();
		
		Matrix multiplication = matrix1.multiply(matrix2);
		if(multiplication != null)
			multiplication.display();
	}
}
