import java.util.Scanner;
/*
    1
   21
  321
 4321
54321
*/
class Example05{
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();

		for(int i=1;i<=n;i++){

			for(int sp=i;sp<n;sp++) 
				System.out.print(" ");

			for(int j=i;j>=1;j--)   
				System.out.print(j);

			System.out.println();	
		}

	}
}