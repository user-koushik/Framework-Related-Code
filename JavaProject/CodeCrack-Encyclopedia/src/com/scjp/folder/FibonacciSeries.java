/**
 * 
 */
package com.scjp.folder;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int maxNumber = 10;
		int previousNumber= 0;
		int nextNumber= 1;
		
		System.out.println("Fibonacci series " +maxNumber+ " numbers: ");
		for(int i=1;i <= maxNumber; i++){
			
			System.out.println(previousNumber + " ");
			
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}

}
