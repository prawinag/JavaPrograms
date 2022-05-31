package Hello;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		/* program to display the star to n rows
*
**				
***		
****				
***** 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the star value to print");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {//looping the value for no. rows to print
			for(int j=1;j<=i;j++) {//looping the value for printing the *
				System.out.print("*");//printing the star
			}
				System.out.println();
				
			
		}

	
	}}

