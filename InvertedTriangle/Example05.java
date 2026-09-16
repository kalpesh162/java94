/*
Aa Aa Aa Aa Aa
Bb Bb Bb Bb
Cc Cc Cc
Dd Dd
Ee
*/
import java.util.Scanner;
class Example05 {
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n=scanner.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=i; j <= n ; j++){
				System.out.print((char)(64+i) +""+(char)(96+i) +"  ");
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