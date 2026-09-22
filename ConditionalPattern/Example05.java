/*
11111
22221
33321
44321
54321
*/
import java.util.Scanner;
class Example05{
	public static void main(String[] args) {
			int n;
			System.out.println("Enter N");
			Scanner scanner=new Scanner(System.in);
			n=scanner.nextInt();
			for(int i=1;i<=n;i++){
				 for(int j=i;j<n;j++)
				 	 System.out.print(i);
				 
				 for(int k=i;k>=1;k--)
				 	 System.out.print(k);
				 
				 System.out.println();
			}
	}
}