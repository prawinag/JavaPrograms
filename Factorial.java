package Hello;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// program to calculate the factorial of a given number
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n value");
		int n= sc.nextInt();//Reading the value from the Scanner
		int fact =1;//intialzing a value for fact
		for(int i=1;i<=n;i++)//looping the value of i
		{
			fact=fact*i;//writing logic to find the factorial
		
		}
System.out.println("the factorial of given number is "+fact);

	}

}
