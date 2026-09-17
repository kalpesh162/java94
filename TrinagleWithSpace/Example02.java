import java.util.Scanner;
/*
    1
   22
  333
 4444
55555
*/
class Example02{
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();

		for(int i=1;i<=n;i++){
			for(int sp=i;sp<n;sp++) 
				System.out.print(" ");

			for(int j=1;j<=i;j++)   
				System.out.print(i);

			System.out.println();	
		}
	}
}