/*
15
14  10
13   9   6
12   8   5  3
11   7   4  2  1
*/
import java.util.Scanner;
class Example07 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n=scanner.nextInt();

		int cnt=n*(n+1)/2;

		for(int i=n;i>=1;i--){
			   int c=cnt;
			  for(int j=n;j>=i;j--){
			  	  System.out.print(c+"\t");
			  	  c=c-(j-1);
			  }
			  cnt--;
			  System.out.println();
		}
		
	}
	
}