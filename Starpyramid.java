package Hello;

import java.util.Scanner;

public class Starpyramid {

	public static void main(String[] args) {
		//programfor the star pyramid reverse order
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){//looping the i value for the rows
			for(int j=n-i;j>0;j--) {
				//printing the spaces in a descending order
				System.out.print(" ");//printing the spaces
			}
			for(int j=1;j<=i;j++) {//looping the value for ascending Stars
				System.out.print("*");//printing the stars
			}
			System.out.println();
			
		}
	}
}

		



	


