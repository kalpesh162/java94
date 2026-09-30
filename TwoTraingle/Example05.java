/*
    *
   * *
  *   *
 *     *
*********

 */

import java.util.Scanner;
class Example05{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=1;i<=n;i++){
				
				for(int sp=i;sp<n;sp++)
					System.out.print(" ");

				for(int j=1;j<=i;j++){
					if(j==1 || i==n)
					System.out.print("*");
					else
					System.out.print(" ");
				}
				for(int j=1;j<i;j++){
					if(j==i-1 || i==n)
					System.out.print("*");
					else
					System.out.print(" ");
				}
				System.out.println();
		}
		
	}
	
}