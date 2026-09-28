import java.util.Scanner;
class Example06{
	public static void main(String[] args) {
			int n;
			System.out.println("Enter N");
			Scanner scanner=new Scanner(System.in);
			n=scanner.nextInt();
			
			for(int i=n;i>=1;i--){

				for(int sp=1;sp<i;sp++)
					System.out.print(" ");

				for(int j=n;j>=i;j--)
					System.out.print(j);

				for(int k=i+1;k<=n;k++)
					System.out.print(k);

				System.out.println();

			}
	}
}