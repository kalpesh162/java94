/*
1
6    2    
10   7    3 
13   11   8    4
15   14   12   9   5

*/
import java.util.Scanner;
class Example08 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n=scanner.nextInt();
		int cnt=1;
		for(int i=n;i>=1;i--){
			int c=cnt;
			  for(int j=i;j <= n ; j++){
			  	  System.out.print(c+"\t");
			  	  c=c-j;
			  }
			  cnt=cnt+i;
			  System.out.println();
		}
		
	}
	
}