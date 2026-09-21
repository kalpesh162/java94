/*
1
2  6
3  7  10
4  8  11  13
5  9  12  14  15
*/
import java.util.Scanner;
class Example06  {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();
		int cnt=1;
		for(int i=n;i>=1;i--){
			int c=cnt;
			 for(int j=n;j>=i;j--){
			 	System.out.print(c+"\t");
			 		c=c+j-1;
			 }
			 cnt++;
			 System.out.println();
		}
	}
}