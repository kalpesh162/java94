import java.util.Scanner;
class Example03{
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();

		for(int l=1;l<=n;l++){

			for(int i=1;i<=n;i++){
				
				for(int j=1;j<=n;j++){

					 for(int k=1;k<=n;k++){
					 	if((l%2==1 && j%2==1 ) || (l%2==0 && j%2==0))
					 	System.out.print("*");
					 	else
					 	System.out.print(" ");
					 }
				}
				System.out.println();
			}

		}
	

	}


}