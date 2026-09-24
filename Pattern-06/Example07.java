import java.util.Scanner;
/*
1
12
123
1234
12345
1234
123
12
1
*/
class Example07 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();

		for(int i=1;i<2*n;i++){
			  if(i<=n){
			  for(int j=1;j<=i;j++){
			  	System.out.print(j);
			  }
			}
			else{
                // i=6  n=5  2*n=10 
				for(int j=1;j<=2*n-i;j++)
					System.out.print(j);
			}
			  System.out.println();
		}
	
	}
	
}