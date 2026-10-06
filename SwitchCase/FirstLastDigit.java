/*Find the first and last digit of any number*/
import java.util.Scanner;
class FirstLastDigit{
	public static void main(String[] args) {
		
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		int temp=num;

		int first=num%10;

		while(num>9)
			num=num/10;

		int last=num;

		System.out.println(first+ "  "+last);


	}
}