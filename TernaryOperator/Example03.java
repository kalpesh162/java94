import java.util.Scanner;
// Largest Number among  four numbers
class Example03{
	public static void main(String[] args) {
		int num1,num2,num3,num4;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value ");
		num1=scanner.nextInt();
		System.out.println("Enter Value ");
		num2=scanner.nextInt();
		System.out.println("Enter Value ");
		num3=scanner.nextInt();
		System.out.println("Enter Value ");
		num4=scanner.nextInt();
		
		
		int large=(num1>num2 && num1>num3 && num1>num4) ? num1 : (num2>num3 && num2>num4) ? num2  : (num3>num4) ? num3 : num4; 

		System.out.println(large);

	}
}