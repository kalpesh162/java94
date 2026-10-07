/*Find LCM  of two numbers*/
// num1=18  
// num2=26

import java.util.Scanner;
class Example07 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter num1 :  ");
		num1=scanner.nextInt();
		System.out.println(" Enter num2 :  ");
		num2=scanner.nextInt();
		int lcm=0;
		int large=(num1>num2) ? num1 : num2;

		int i=1;
		while(true){

			int res=large*i;
			if(res%num1==0  && res%num2==0){
				 lcm=res;
				 break;
			}
			i++;

		}

		System.out.println(lcm);
	}
	
}