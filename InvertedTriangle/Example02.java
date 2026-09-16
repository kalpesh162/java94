/*
54321
5432
543
54
5
*/
import java.util.Scanner;
class Example02 {
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n=scanner.nextInt();

		for(int i=n;i>=1;i--){
			for(int j=i; j >= 1 ; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}