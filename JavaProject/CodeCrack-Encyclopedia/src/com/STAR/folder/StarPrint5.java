/**
 * 
 */
package com.STAR.folder;

/*Source code to print below start pattern:

O/P: 
	*   *
	*  *
	* *
	* *
	*  *
	*    * 
*/
public class StarPrint5 {
	
	public static void main(String[] args) {
		
		int i,j;
		
		for(i=1;i<=5;i++){
			for(j=1;j<=9;j++){
				
				if(i==1 || i==5){
					if(j==1 || j==9){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				if(i==2 || i==4){
					if(j==1 || j==7){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				if(i==3){
					if(j==1 || j==2){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
			}
			System.out.println(); 
		}

	}

}
