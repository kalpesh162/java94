/*
5
44
333
2222
11111
*/
import java.util.Scanner;
class Example02{
	public static void main(String a[]){
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows");
		n=scanner.nextInt();

		for(int i=n;i>=1;i--){
			 for(int j=i;j<=n;j++)
			 	System.out.print(i);

			 System.out.println();
		}
      // OR j loop  for(j=n;j>=i;j--)
	}
}
