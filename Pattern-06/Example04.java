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
class Example04 {

	public static void main(String[] args) {
					Scanner scanner=new Scanner(System.in);
			int n;
			System.out.println("Enter Row");
			n=scanner.nextInt();

			for(int i=1;i<2*n;i++){
				if(i<=n){
					for(int j=1;j<=i;j++){
						System.out.print(i);
					}
				}
				else{  // i=6  n=5 2*n=10
					for(int j=1;j<=(2*n-i);j++){
						System.out.print(2*n-i);	
					}
				}

				System.out.println();
			}

	}
	
}