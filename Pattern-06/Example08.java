import java.util.Scanner;
/*
5
54
543
5432
54321
5432
543
54
5
*/
class Example08 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();

		for(int i=n;i>=1;i--){
			  for(int j=n;j  >= i;j--){
			  	System.out.print(j);
			  }
			  System.out.println();
		}

		for(int i=1;i<=n-1;i++){
			 for(int j=n;j>i;j--){
			 	System.out.print(j);
			 }
			 System.out.println();
		}
		
	}
	
}