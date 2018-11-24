/**
 * 
 */
package com.scjp.folder;

/**
 * @author ksinha
 *
 */

class Bob{
	int size;
	String name;
	
	public Bob(int size, String name) {
		super();
		this.size = size;
		this.name = name;
	}
	
	// If you don't override the toString() method then you will get o/p as com.scjp.folder.Bob@15db9742
	public String toString(){
		
		return("I am Bob but you can call me " + name + "." + "  " +  "My shoe size is " + size + "."); 
	}
}

public class ToString2 {

	public static void main(String[] args) {
		
		Bob bobPer = new Bob(8, "Bob Dylan");
		
		System.out.println(bobPer); 

	}

}
