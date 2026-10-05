import java.util.Scanner;
// Largest Number Between  two numbers
class Example02{
	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value ");
		num1=scanner.nextInt();
		System.out.println("Enter Value ");
		num2=scanner.nextInt();
		
		int large=(num1>num2)?num1:num2;

		System.out.println(large);

	}
}