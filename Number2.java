package Hello;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");//reading the value from user
		int n=sc.nextInt();
		int num=1;//intialzing vaue with 1
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num=num+1;//adding num to increasing every time
			}
			
		System.out.println();
			
		}
	}
}

	
	
	
	



