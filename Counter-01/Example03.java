/*
1 
3   2
6   5  4
10  9  8  7
15 14  13 12 11
*/
import java.util.Scanner;
class Example03  {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();
		
		for(int i=1;i<=n;i++){
		           int c=i*(i+1)/2;
			 for(int j=1;j<=i;j++){
			 	System.out.print(c+"\t");
			 	c--;
			 }
			 System.out.println();
		}
	}
}