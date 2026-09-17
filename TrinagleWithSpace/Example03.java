import java.util.Scanner;
/*
    5
   44
  333
 2222
11111
*/
class Example03{
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();

		for(int i=n;i>=1;i--){
			for(int sp=1;sp<i;sp++) 
				System.out.print(" ");


			for(int j=i;j<=n;j++)   
				System.out.print(i);

			System.out.println();	
		}


	}
}