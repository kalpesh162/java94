
/*  Write a Java program to check whether two matrices are equal or not. */
import java.util.Scanner;
public  class Exmple01 {

	public static void input_array(int arr[][]){
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			 for(int j=0;j<arr[i].length;j++){
			 	System.out.println("Enter");
			 	arr[i][j]=scanner.nextInt();
			 }
		}
	}
	
   public static void display(int arr[][]){
   		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
			 	System.out.print(arr[i][j]+"  ");
			 System.out.println();
		}
   }

   public static boolean isEqual(int A[][],int B[][]){
   	    for(int i=0;i<A.length;i++)
			for(int j=0;j<A[i].length;j++)
				if(A[i][j]!=B[i][j]) return false;
	
		return true;
   }


	public static void main(String[] args) {

		int row,col;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ROW");
		row=scanner.nextInt();
		System.out.println("Enter  COLUMN");
		col=scanner.nextInt();

		int A[][]=new int[row][col];
		System.out.println("*** INPUT A *****");
		input_array(A);
		int B[][]=new int[row][col];
		System.out.println("*** INPUT B *****");
		input_array(B);

		System.out.println("*** A *****");
		display(A);
		System.out.println("*** B *****");
		display(B);

		boolean yesOrNo=isEqual(A,B);

		System.out.println(yesOrNo);
		
	}
	
}

