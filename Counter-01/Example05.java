/*
15
13  14
10  11  12
6    7   8   9
1    2   3   4   5
*/
import java.util.Scanner;
class Example05  {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();
			int cnt=n*(n+1)/2;

		for(int i=1;i<=n;i++){
		           int c=cnt;
			 for(int j=1;j<=i;j++){
			 	System.out.print(c+"\t");
			 	c++;
			 }
			 System.out.println();
			 cnt=cnt-i-1;
		}
	}
}