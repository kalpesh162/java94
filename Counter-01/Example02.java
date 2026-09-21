/*
15  
14 13  
12 11 10  
9  8  7  6  
5  4  3  2  1
*/
import java.util.Scanner;
class Example02  {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();
		int cnt=n*(n+1)/2;
		for(int i=1;i<=n;i++){
			 for(int j=1;j<=i;j++){
			 	System.out.print(cnt+"\t");
			 	cnt--;
			 }
			 System.out.println();
		}
	}
}