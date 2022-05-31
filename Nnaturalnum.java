package Hello;

import java.util.Scanner;

public class Nnaturalnum {

	public static void main(String[] args) {
		// program to display n natural numbers and sum of n ntural numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");//reading the the n value from the user
		int n = sc.nextInt();
		System.out.println("The n natural numbers are");
		int sum=0;
		for(int i=1;i<=n;i++) //looping the value for n value
			
		{
		System.out.println(" " +i);

         sum= sum+i;//summing then n values 
		} 

		System.out.println("The sum of the n natural numbers are "+sum);//Displaying the sum of n values
	}

}
