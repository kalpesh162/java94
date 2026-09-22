/*
10101
10101
10101
10101
10101
*/
import java.util.Scanner;
class Example01{
	public static void main(String[] args) {
			int n;
			System.out.println("Enter N");
			Scanner scanner=new Scanner(System.in);
			n=scanner.nextInt();
			for(int i=1;i<=n;i++){
				 for(int j=1;j<=n;j++){
				 	 if(j%2==0){
				 	 	System.out.print("0");
				 	 }
				 	 else{
				 	 	System.out.print("1");
				 	 }
				 }
				 System.out.println();
			}
	}
}