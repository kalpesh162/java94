import java.util.Scanner;
/*
5
54
543
5432
54321
5432
543
54
5
*/
class Example09 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();
		for(int i=1;i<2*n;i++){
			if(i<=n){
				for(int j=n; j >= n-i+1 ;j--){
					System.out.print(j);
				}
			}
			else{
				  // i=6  n=5 2*n=10
				for(int j=n; j>=(i-n+1);j--){
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
	
}