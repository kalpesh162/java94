import java.util.Scanner;
/*
5
45
345
2345
12345
2345
345
45
5
*/
class Example11 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();
		for(int i=1;i<2*n;i++){
			if(i<=n){
				for(int j=n-i+1; j <= n;j++){
					System.out.print(j);
				}
			}
			else{
				  // i=6  n=5 2*n=10
				for(int j=i-n+1; j<=n;j++){
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
	
}