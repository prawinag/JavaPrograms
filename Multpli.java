package Hello;

import java.util.Scanner;

public class Multpli {

	public static void main(String[] args) {
		// Program to display the tables upto the given number
		Scanner sc= new Scanner(System.in);//Reading the n value from the user
		System.out.println("enter the n value");//taking n value from the user
		int n= sc.nextInt();
		for(int j=1;j<=n;j++) {
			//loop for the tables from 2 to until n values
		System.out.println(" multiplication table "+j);//printing the statement  upto n
		for(int i=1;i<=10;i++) //looping the iteration of values
			System.out.println(j+" X"+i+" =" +(j*i));
		//multiplying the j and i value until n
	
		}
		

		

	}

}
