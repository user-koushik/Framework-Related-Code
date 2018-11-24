/**
 * 
 */
package com.STAR.folder;

/*Source code to print below start pattern:

O/P: 

	* * * *
	* * * *
	* * * *
	* * * *
	
*/
public class StarPrint1 {
	
	public static void print4Star(int n){
		
		int i,j;
		
		for(i=1;i<=n;i++){
			
			/*for(j=4;j>=1;j--) // This will also work */			
			
			for(j=1;j<=n;j++){
			
				System.out.print("*");
			}
			
			System.out.println(); 
		}
	}
	
	public static void main(String[] args) {
		
		int n=4;
		print4Star(n); 

	}

}
