import java.util.Scanner;
class Triangle {

	public static void input_array(char arr[][]){
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			 for(int j=0;j<arr[i].length;j++){
			 	System.out.println("Enter");
			 	arr[i][j]=scanner.next().charAt(0);
			 }
		}
	}
	
   public static void display(char arr[][]){
   		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
			 	System.out.print(arr[i][j]+" ");
			 System.out.println();
		}
   }


	public static void main(String[] args) {
		int rows;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rows");
		rows=scanner.nextInt();

		char arr[][]=new char[rows][];

		int col;

		for(int i=0;i<arr.length;i++){
			 System.out.println("Enter Column");
			 col=scanner.nextInt();
			 arr[i]=new char[col];
		}

		input_array(arr);

		display(arr);


	}
	
}