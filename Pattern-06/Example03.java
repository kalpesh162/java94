/*
1
22
333
4444
55555
4444
333
22
1
*/
import java.util.Scanner;
class Example03 {

	public static void main(String[] args) {
					Scanner scanner=new Scanner(System.in);
			int n;
			System.out.println("Enter Row");
			n=scanner.nextInt();

			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					System.out.print(i);
				}
				System.out.println();
			}

			for(int i=n-1;i>=1;i--){
				 for(int j=1;j<=i;j++){
				 	System.out.print(i);
				 }
					System.out.println();
			}

	}
	
}