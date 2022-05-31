package Hello;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {

		// program for printing

/*.program to display the pattern like right angle triangle using an asteri
1	
1 2
1 2 3
1 2 3 4 
1 2 3 4 5
*/
Scanner sc=new Scanner(System.in);
System.out.println("enter the n value");
int n=sc.nextInt();
	for(int i=1;i<=n;i++)//looping the value for the number of rows
	{
		for(int j=1;j<=i;j++) {
			//looping the columns to print value 
			System.out.print(j+" ");
			
	}

	System.out.println();
	}
	}
}



