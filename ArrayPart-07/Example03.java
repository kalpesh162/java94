// Jagged Array  or Ragged Array
import java.util.Scanner;

public class Example03{

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

	public static void main(String[] args) {
		int rows;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows");
		rows=scanner.nextInt();

		int arr[][]=new int[rows][];

		int col;

		for(int i=0;i<arr.length;i++){
			 System.out.println("Enter Column");
			 col=scanner.nextInt();
			 arr[i]=new int[col];
		}

		input_array(arr);

		display(arr);



	}
}