/**
 * 
 */
package com.scjp.folder;

/**
 * @author ksinha
 *
 */

class TestEqual{
	
	int size;
	
	public TestEqual(int size) {
		super();
		this.size = size;
	}
}


public class EqualsAndSign {

	public static void main(String[] args) {
		
		TestEqual eq1 = new TestEqual(8);
		TestEqual eq2 = new TestEqual(9);
		
		boolean result;
		
		// "==" mostly used to compare primitives not for objects which will always return false
		result = (eq1 == eq2);
		System.out.println(result);
		
		// default implementation of equals method just compare memory 
		// address of two objects and return true

		if (true == result)
			System.out.println("Always False == in this case.");
		else{
			System.out.println("False == in this case.");
		}
		
		// equals() used to compare objects but advisable to override equals() method, if not it will print false for below 
		// case like "=="
		result = (eq1.equals(eq2));
		System.out.println(result); 
		
		if (true == result)
			System.out.println("Always False equals() in this case.");
		else{
			System.out.println("False equals() in this case.");
		}
	}
}










