/*
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
 */

import java.util.Scanner;
class Example07{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=1;i<=n;i++){

			for(int sp=i;sp<n;sp++)
				System.out.print(" ");

			for(int j=1;j<=i;j++)
				System.out.print(j);

			for(int k=i-1;k>=1;k--)
				System.out.print(k);

			System.out.println();	
		}

		for(int i=n-1;i>=1;i--){
			  for(int sp=i;sp<n;sp++)
			  	System.out.print(" ");
			  for(int j=1;j<=i;j++)
			  	System.out.print(j);
			  for(int k=i-1;k>=1;k--)
			  	System.out.print(k);
			  System.out.println();	
		}
	}
	
}