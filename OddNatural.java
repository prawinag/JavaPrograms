package Hello;

import java.util.Scanner;

public class OddNatural {

	public static void main(String[] args) {
		//6.program to display the n terms of odd natural number and their sum -
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n value");
	int n = sc.nextInt();//Reading the no. from the user
	int sum = 0;//intialzing sum value as 0
	for(int i=1;i<=n;i++){//looping the i value until n value
		if(i%2!=0)//giving condition for checking of odd numbers 
	   System.out.println(" "+i);
	
	   sum =sum+i;//adding the sum of odd numbers
	
	}
	System.out.println("Sum of given natural numbers are "+sum);//printing the sum result
	
		
			
		
		
	}
	
	
	
	

}
