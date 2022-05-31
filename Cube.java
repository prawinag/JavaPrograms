package Hello;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// 5.program to display the cube of the number upto given an integer
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n =sc.nextInt();//reading the n value from the user
		for(int i =1;i<=n;i++) {//writing the loop for the number upto given integer
			
			System.out.println( "cube of the given no : "+i);//printing the statement of the number 
			System.out.println( (i*i*i));//printing the logic for the cube of the given number
		}

	}

}
