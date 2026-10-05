import java.util.Scanner;
class Example01{
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value ");
		num=scanner.nextInt();
		/*
		if(num%2==0){	
			System.out.println("EVEN ");
		}
		else{
			System.out.println("ODD ");
		}
		*/
		String message = (num%2==0) ? "Even "  : "ODD";

		System.out.println(message);
	
		//int res=(num%2==0) ? num : num;

		int res=(num%2==0) ? 0 : 1;

		System.out.println(res);
		
	}
}