/*
11111
AAAAA    64   i=2   64+i/2    1
11111  
BBBBB    64   i=4   64+4/2    2
11111
CCCCC    64   i=6   64+6/2    3
11111
DDDDD    64   i=8   64+8/2    4
*/
import java.util.Scanner;
class Example04{
	public static void main(String[] args) {
			int n;
			System.out.println("Enter N");
			Scanner scanner=new Scanner(System.in);
			n=scanner.nextInt();
			for(int i=1;i<=n;i++){
				 for(int j=1;j<=n;j++){
				 	 if(i%2==0){
				 	 	System.out.print((char)(64+(i/2)));
				 	 }
				 	 else{
				 	 	System.out.print("1");
				 	 }
				 }
				 System.out.println();
			}
	}
}