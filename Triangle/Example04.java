/*
5
45
345
2345
12345
*/
import java.util.Scanner;
class Example04{
	  
	  public static void main(String a[]){

	  	int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows");
		n=scanner.nextInt();

		for(int i=n;i>=1;i--){
			for(int j=i ;j<=n;j++){
				 System.out.print(j);
			}		
			System.out.println();
		}
             

	  }

}
