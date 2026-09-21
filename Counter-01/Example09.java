/*
11
12      7
13      8       4
14      9       5       2
15      10      6       3       1
*/
import java.util.Scanner;
class Example09 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n=scanner.nextInt();
		int cnt=(n*(n-1)/2)+1;
		for(int i=n;i>=1;i--){
			int c=cnt;
			  for(int j=n;j>=i ; j--){
			  	  System.out.print(c+"\t");
			  	  c=c-j;
			  }
			  cnt++;
			  System.out.println();
		}
		
	}
	
}