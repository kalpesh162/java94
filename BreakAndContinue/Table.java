/*Write a Java program to print a multiplication table of any number.*/
import java.util.Scanner;
class Table{
	
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N  ONLY ODD");
		n=scanner.nextInt();

		for(int i=1;i<=10;i++)
			System.out.println(n*i);

		System.out.println("---------------------------");

		for(int i=1;i<=10;i++){
			  for(int j=1;j<=10;j++){
			  	  System.out.print(i*j +"  ");
			  }
			  System.out.println();
		}

		
	}
}

