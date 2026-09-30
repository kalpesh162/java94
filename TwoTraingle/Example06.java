import java.util.Scanner;
/*
123454321
1234-4321
123---321
12-----21
1-------1
12-----21
123---321
1234-4321
123454321
*/
class Example06{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();

		for(int i=n;i>=1;i--){
			if(i==n){
				for(int j=1;j<=n;j++)
					System.out.print(j);
				for(int j=n-1;j>=1;j--)
					System.out.print(j);
			}
			else{
			 for(int j=1;j<=i;j++)
			 	System.out.print(j);

			 for(int sp=1;sp<=(2*(n-i))-1;sp++)
			 	System.out.print("-");

			  for(int j=i;j>=1;j--)
			 	System.out.print(j);
			}
			 System.out.println();
		}

		for(int i=2;i<=n;i++){
			 if(i==n){
			 	for(int j=1;j<=n;j++)
					System.out.print(j);
				for(int j=n-1;j>=1;j--)
					System.out.print(j);
			 }
			 else{
			 	for(int j=1;j<=i;j++)
			 		System.out.print(j);

			 	for(int sp=1;sp<2*(n-i);sp++)
			 		System.out.print("-");

			 	for(int j=i;j>=1;j--)
			 		System.out.print(j);

			 }
			 System.out.println();
		}
	}
}