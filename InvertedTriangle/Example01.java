/*
54321
5432
543
54
5
*/
import java.util.Scanner;
class Example01 {
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n=scanner.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=n; j >= i ; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}