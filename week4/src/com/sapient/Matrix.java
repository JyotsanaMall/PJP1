package com.sapient;

public class Matrix {
	private int [][] arr;
	int m, n;
	
	public Matrix() {
		arr = new int[3][3];
		m = 3;
		n = 3;
	}
	
	public Matrix(int m, int n) {
		arr = new int[m][n];
		this.m = m;
		this.n = n;
	}
	
	public Matrix(Matrix ob) {
		this.m = ob.m;
		this.n = ob.n;
		this.arr = new int[m][n];
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				this.arr[i][j] = ob.arr[i][j];
	}
	
	public void read() {
		System.out.println("Enter matrix values: ");
		for(int i=0; i<m; i++) 
			for(int j=0; j<n; j++)
				arr[i][j] = Read.scanner.nextInt();
	}
	
	public void display() {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) 
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	
	public Matrix add(Matrix a) {
		Matrix res = null;
		if(this.m == a.m && this.n == a.n) {
			res = new Matrix(m,n);
			
			for(int i=0; i<this.m; i++)
				for(int j=0; j<this.n; j++)
					res.arr[i][j] = this.arr[i][j] + a.arr[i][j];
		}
		return res;
	}
	
	public boolean isScalar() {
		if(n!=m) 
			return false;

		int value = arr[0][0]; 
		for(int i=0; i<m; i++) 
			for(int j=0; j<n; j++) { 
				if(i!=j && arr[i][j]!=0) 
					return false; 
				if(i==j && value != arr[i][j]) 
					return false; 
			}
		return true; 
	}
	
	public Matrix multiply(Matrix matrix1) {
		Matrix res = null;
		if(this.n == matrix1.m) {
			int dim1 = this.m; 
			int dim2 = matrix1.arr[0].length; 
			res = new Matrix(dim1,dim2);
			
			for(int i=0; i<dim1; i++) {
				for(int j=0; j<dim2; j++) {
					int val = 0; 
					for(int k=0; k<m; k++) {
						val += this.arr[i][k]* matrix1.arr[k][j];
					}
					res.arr[i][j] = val; 
				}
			}
		}
		return res; 
	}
}
