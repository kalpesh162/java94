import java.util.Scanner;
class Example01{
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();

		for(int i=1;i<=n;i++){
			for(int sp=i;sp<n;sp++)
				System.out.print(" ");


			for(int j=1;j<=i;j++)    // for(int j=i;j>=1;j--)
				System.out.print("*");

			System.out.println();	
		}


	}
}