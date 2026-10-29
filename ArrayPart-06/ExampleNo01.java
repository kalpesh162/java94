import java.util.Scanner;
public class ExampleNo01{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int arr[][]=new int[3][3];

		for(int i=0;i<arr.length;i++){
			  for(int j=0;j<arr[i].length;j++){
			  	System.out.println("Enter");
			  	arr[i][j]=scanner.nextInt();
			  }
		}



		for(int i=0;i<arr.length;i++){
			  for(int j=0;j<arr[i].length;j++){
			  	System.out.print(arr[i][j]+"  ");
			  }
			  System.out.println();
		}

		
	}
}