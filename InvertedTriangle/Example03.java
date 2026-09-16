/*
11111    
2222
333
44
5
*/
import java.util.Scanner;
class Example03 {
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n=scanner.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=i; j <= n ; j++){
				System.out.print(i);
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