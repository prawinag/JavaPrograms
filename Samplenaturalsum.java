package Hello;

import java.util.Scanner;

public class Samplenaturalsum {

	public static void main(String[] args) {
		// Program for the sum of n natural numbers
	Scanner sc = new Scanner(System.in);//taking the value from the user
	System.out.println("enter the n value");
	int n= sc.nextInt();//Reding the n value from the reader
	int sum =0;
	for(int i=1;i<=n;i++)

	{
		sum=sum+i;
	}
	System.out.println("The Sum of n natural numbers are " +sum);
	}

}
