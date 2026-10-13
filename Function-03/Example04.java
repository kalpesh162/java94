/*Write a  Java  program to check whether a number is a Prime number or not.*/
// int 2147483647   -2147483648
import java.util.Scanner;
class Example04 {
	
	static boolean isPrime(int num){
		if(num==0 || num==1) return false;

		boolean flag=true;
		for(int i=2;i<num;i++){
			  if(num%i==0){
			  	 flag=false;
			  	 break;
			  }
		}
		return flag;
	}

	public static void main(String[] args) {
		int cnt=0;
		System.out.printf("SRNO                          PRIME \n");
		System.out.println("-------------------------------------------------------");
		for(int i=1;i<=2147483647;i++){
			boolean yesOrNo=isPrime(i);
				  
			if(yesOrNo){
				  System.out.printf("%14d   %14d \n",++cnt,i);
			}

		}
		
		
	}
	
}