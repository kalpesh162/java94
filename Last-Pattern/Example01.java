import java.util.Scanner;
class Example01{
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();

	for(int i=1;i<=n;i++){
		
		for(int j=1;j<=n;j++){

			 for(int k=1;k<=n;k++)
			 	System.out.print("*");
			 System.out.print("  ");
		}
		System.out.println();
	}
}


}