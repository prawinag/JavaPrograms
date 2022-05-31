package Hello;

import java.util.Scanner;

public class Starpyramid2 {

	public static void main(String[] args) {
		// program for the Starpyramid
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value");
		int n= sc.nextInt();//reading n value from the user
		for(int i=1;i<=n;i++) {//looping the values for the number of rows
			for(int j=n-i;j>0;j--)//looping the spaces in a descending order
			{
				System.out.print(" ");//printing the spaces
				
			}
			for(int j=1;j<=i;j++) {//looping the values for the starts in asending order with extra space
				System.out.print("* ");//printing the star  with extra space
				
			}
			System.out.println();
			
		}

	}

}
