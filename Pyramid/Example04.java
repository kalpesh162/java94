/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
import java.util.Scanner;
class Example04{
	public static void main(String[] args) {
			int n;
			System.out.println("Enter N");
			Scanner scanner=new Scanner(System.in);
			n=scanner.nextInt();
			for(int i=1;i<=n;i++){
				for(int sp=i;sp<n;sp++)
					System.out.print(" ");

				for(int j=1;j<2*i;j++)
					System.out.print("*");

				System.out.println();
			}

				for(int i=n-1;i>=1;i--){

				for(int sp=i;sp<n;sp++)
					System.out.print(" ");

				for(int j=1;j<=2*i-1;j++)
					System.out.print("*");

				System.out.println();

			}
	}
}