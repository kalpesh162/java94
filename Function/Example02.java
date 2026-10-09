import java.util.Scanner;

class Example02 {
	// x, y  Formal Paramters
	static void doAdd(int x,int y){

		int res=x+y;
		System.out.println(res);
	}
	static void doSub(int x,int y){

		int res=x-y;
		System.out.println(res);
	}
	static void doMul(int x,int y){

		int res=x*y;
		System.out.println(res);
	}
	static void doDiv(int x,int y){

		int res=x/y;
		System.out.println(res);
	}

	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Num1");
		num1=scanner.nextInt();
		System.out.println("Num2");
		num2=scanner.nextInt();

		doAdd(num1,num2);  // METHOD CALL  // CALL BY VALUE  
		// num1 & num2 --> Actual Parmeters

		doSub(num1,num2);
		doDiv(num1,num2);
		doMul(num1,num2);
		
	}
	
}