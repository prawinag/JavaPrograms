package Hello;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		//  to display program for the multiplication table of a given integer
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value");
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+(n*i));
		}

	}

}


