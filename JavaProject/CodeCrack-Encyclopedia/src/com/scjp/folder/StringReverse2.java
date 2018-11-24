/**
 * 
 */
package com.scjp.folder;

/*Source code to find the duplicates character in the given String 

i/p: LONDON

o/p: O

*/

public class StringReverse2 {

	public static void main(String[] args) {
		
		String str = "London";
		
		System.out.println("String Length: " + str.length());
		
		char[] convStr = str.toCharArray();
		
		System.out.println("Duplcates elements are: ");
		
		int counter = 0;
		
		for(int i=0;i < str.length(); i++){
			
			for(int j=i+1;j< str.length();j++){
				
				if(convStr[i] == convStr[j]){
					System.out.println(convStr[j]);
					counter ++;
					break;
				}
					
			}
		}
	}
}
