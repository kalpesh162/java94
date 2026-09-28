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
import java.util.Scanner;
class Example01 {

	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N");
		n=scanner.nextInt();

		for(int i=1;i<2*n;i++){
			if(i<=n){
			 for(int sp=i;sp<n;sp++){
			 System.out.printf("%3s"," ");
			 //	System.out.print("  ");
			 }
			 for(int j=1;j<=i;j++){
			 	//System.out.print(j);
			 	System.out.printf("%-3d",j);
			 }
			}
			else{
				for(int sp=n;sp<i;sp++){
					//System.out.print("  ");
					System.out.printf("%3s","   ");
				}
				
				for(int j=1;j<=(2*n-i);j++){
			 	//System.out.print(j);
					System.out.printf("%-3d",j);
				}
			}
			System.out.println();
		}


	}
	
}