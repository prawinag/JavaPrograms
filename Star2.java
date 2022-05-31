package Hello;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		/*program to create the star rows in descending order
		*****
		****
		***
		**
		*
		*
		**/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value to print stars in desecnding order");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
