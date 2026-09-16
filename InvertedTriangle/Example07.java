import java.util.Scanner;
/*
55555
4444
333
22
1
*/
class Example07 {

	public static void main(String[] args) {
			int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n=scanner.nextInt();

		for(int i=n;i>=1;i--){
			  for(int j=1;j<=i;j++)
			  	System.out.print(i);

			  System.out.println();
		}

	}
	
}