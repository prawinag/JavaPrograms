package Hello;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// program for printing

/*.program to display the pattern like right angle triangle using an asteri
1	
2 2
3 3 3
4 4 4 4 
5 5 5 5 5
*/
Scanner sc=new Scanner(System.in);
System.out.println("enter the n value");
int n=sc.nextInt();
for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
			
	}
		System.out.println();
}
		

	}

}
