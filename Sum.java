package Hello;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		//program to read 10 numbers from keyboard and find their sum and average.
		System.out.println("enter any 10 numbers");
		Scanner sc= new Scanner(System.in);
		int n1= sc.nextInt();//reading 10 numbers from the user
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		int n4= sc.nextInt();
		int n5= sc.nextInt();
		int n6= sc.nextInt();
		int n7= sc.nextInt();
		int n8= sc.nextInt();
		int n9= sc.nextInt();
		int n10= sc.nextInt();
		int sum;
		float avg;
		System.out.println("The sum of 10 numbers is :" +(sum=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10));//Adding all the numbers taken from the keyboard
		System.out.println("The avg of 10 numbers is :" +(avg=(sum/10)));//finding the avg by using sum value and pinting
	}
	
		
		


	}


