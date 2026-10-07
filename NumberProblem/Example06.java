/*Find LCM  of two numbers*/
// num1=18  
// num2=26

import java.util.Scanner;
class Example06 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter num1 :  ");
		num1=scanner.nextInt();
		System.out.println(" Enter num2 :  ");
		num2=scanner.nextInt();
		int lcm=0;
		int large=(num1>num2) ? num1 : num2;

		for(int i=1;(large*i)<=num1*num2;i++){
			 if(large*i%num1==0 && large*i%num2==0){ 
			 	lcm=large*i; break;
			 }
		}

		System.out.println(lcm);
	}
	
}