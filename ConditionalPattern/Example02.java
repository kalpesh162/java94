/*
AAAAA
bbbbb
CCCCC
ddddd
EEEEE
*/
import java.util.Scanner;
class Example02{
	public static void main(String[] args) {
			int n;
			System.out.println("Enter N");
			Scanner scanner=new Scanner(System.in);
			n=scanner.nextInt();
			for(int i=1;i<=n;i++){
				 for(int j=1;j<=n;j++){
				 	 if(i%2==0){
				 	 	System.out.print((char)(96+i));
				 	 }
				 	 else{
				 	 	System.out.print((char)(64+i));
				 	 }
				 }
				 System.out.println();
			}
	}
}