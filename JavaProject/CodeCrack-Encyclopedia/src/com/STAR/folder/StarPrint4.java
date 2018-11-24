/**
 * 
 */
package com.STAR.folder;

/*Source code to print below start pattern:

O/P: 
	* * - * *
	* * - * *
	* * - * *
	* * - * *
*/
public class StarPrint4 {
	
	public static void main(String[] args) {
		
		int i,j;
		
		for(i=0;i<=4;i++){
			for(j=1;j<=5;j++){
				
				if(j==1 || j==2 || j==4 || j==5 ){
					System.out.print(" * ");
				}
				else{
					System.out.print(" - ");
				}
			}
			System.out.println(); 
		}

	}

}
