/*
*       *
**     **
***   ***
**** ****
*********
 */

import java.util.Scanner;
class Example01{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=1;i<=n;i++){

			if(i==n){
				for(int sp=1;sp<2*n;sp++)
					System.out.print("*");
			}
			else{

			for(int j=1;j<=i;j++)
				System.out.print("*");

			for(int sp=1;sp<2*(n-i);sp++)
				System.out.print(" ");

			for(int j=1;j<=i;j++)
				System.out.print("*");

			}
			System.out.println();	
		}
		
	}
	
}