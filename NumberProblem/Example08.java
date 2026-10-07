/*Find LCM  of two numbers*/
// num1=18  
// num2=26

import java.util.Scanner;
class Example08 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter num1 :  ");
		num1=scanner.nextInt();
		System.out.println(" Enter num2 :  ");
		num2=scanner.nextInt();

		int hcf=0;
		int end=(num1<num2) ? num1 : num2;

		for(int i=1;i<=end;i++){
			 if(num1%i==0 && num2%i==0) hcf=i;
		}

		lcm=(num1*num2)/hcf;

		System.out.println(lcm);
	}
	
}