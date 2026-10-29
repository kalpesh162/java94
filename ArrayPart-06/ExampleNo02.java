import java.util.Scanner;
public class ExampleNo02{

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
			  for(int j=0;j<arr[i].length;j++){
			  	System.out.printf("[%d %d]   %-5d  ",i,j,arr[i][j]);
			  }
			  System.out.println();
		}
	}

	public static void display2(int arr[][]){
       for(int A[] : arr){
             for(int ele:A)
             	System.out.print(ele+"  ");
             System.out.println();
       }
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows");
		int row=scanner.nextInt();
		System.out.println("Enter Columns");
		int column=scanner.nextInt();
		
		int arr[][]=new int[row][column];

		input_array(arr);

		//display(arr);
		display2(arr);

		
	}
}