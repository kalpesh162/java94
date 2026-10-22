import java.util.Scanner;
class Example02 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);	
		int numbers[]=new int[5];

		for(int i=0;i<numbers.length;i++){
			System.out.println("Enter Number ....");
			 numbers[i]=scanner.nextInt();
		}

		// print Array

		for(int i=0;i<numbers.length;i++){
			 System.out.println(i  +" = "+numbers[i]);
		}



	}
	
}