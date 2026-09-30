import java.util.Scanner;
class Example03 {

	public static void main(String[] args) {

		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
	
	for(int k=1;k<=n;k++){

		for(int i=1;i<=n;i++){
			 for(int j=1;j<=n;j++){
			 	System.out.print("*");
			 }
			 System.out.print("  ");
			 for(int j=1;j<=n;j++){
			 	System.out.print("*");
			 }
			 System.out.print("  ");
			 for(int j=1;j<=n;j++){
			 	System.out.print("*");
			 }
			 System.out.print("  ");
			 for(int j=1;j<=n;j++){
			 	System.out.print("*");
			 }
			 System.out.print("  ");
			 for(int j=1;j<=n;j++){
			 	System.out.print("*");
			 }
			 System.out.print("  ");
			 
			 System.out.println();
		}
		 System.out.println();
	}
		
	}
	
}