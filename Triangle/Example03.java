/*
1
21
321
4321
54321
*/

import java.util.Scanner;
class Example03{
	  
	  public static void main(String a[]){

	  	int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows");
		n=scanner.nextInt();

		for(int i=1;i<=n;i++){
			  for(int j=i;j>=1;j--){
			  	 System.out.print(j);
			  }
			  System.out.println();
		}

             

	  }

}
