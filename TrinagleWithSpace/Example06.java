import java.util.Scanner;
/*
    5
   54
  543
 5432
54321
*/
class Example06{
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();

		for(int i=n;i>=1;i--){

			for(int sp=1;sp<i;sp++) 
				System.out.print(" ");

			for(int j=n;j>=i;j--)   
				System.out.print(j);

			System.out.println();	
		}

	}
}