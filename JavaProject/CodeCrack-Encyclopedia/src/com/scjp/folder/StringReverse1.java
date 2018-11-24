/**
 * 
 */
package com.scjp.folder;

/*Source code to reverse the given String

i/p: LONDON

o/p: NODNOL

*/

public class StringReverse1 {

	public static void main(String[] args) {
		
		String str = "London";
		
		System.out.println("String Length: " + str.length());
		
		char[] convStr = str.toCharArray();
		
		for(int i=convStr.length-1;i>=0;i--){
			System.out.print(convStr[i]); 
		}
	}
}
