/*
A1 A2 A3 A4 A5
B2 B3 B4 B5
C3 C4 C5
D4 D5
E5
*/
import java.util.Scanner;
class Example06 {
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n=scanner.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=i; j <= n ; j++){
				System.out.print((char)(64+i) +""+ j +"  ");
			}
			System.out.println();
		}

		/*
		for(int i=1;i<=n;i++){
			for(int j=n; j >= i ; j--){
				System.out.print(i);
			}
			System.out.println();
		}
		*/
	}
	
}