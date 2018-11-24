/**
 * 
 */
package com.scjp.folder;

/**
 * @author ksinha
 *
 */

class A{
	
	void print(){
		System.out.println("A/C Number");
	}
	
	void demo(){
		System.out.println("What's gonna happen?");
	}
}
class B extends A{
	
	private int x = 6;
	void print(){
		System.out.println("NO issue from Child");
	}
	
	void childMet(){
		System.out.println("Private Value print" + x);
	}
}

public class OverLoadAndRide1 {

	public static void main(String[] args) {
		
		A aaObj2 = new B();
		
		aaObj2.print();
		aaObj2.demo();
		
		((B) aaObj2).childMet(); // To explicitly call the child class object using parent class object
		
		B bbObj3 = new B();
		
		bbObj3.print();
		bbObj3.demo();
		
		((A) bbObj3).print();	// Not gonna Work
		
		
		//B objB = (B) new A();	// Never going to work while calling parent specific method
		
		// objB.print();	// ClassCast exception
		// objB.childMet(); // ClassCast exception
	}
}









