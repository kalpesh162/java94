/*Reverse a given number
  num=1234   output=4321
*/   
import java.util.Scanner;
class ReverseNum {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		
		int temp=num;
		int sum=0; 

		while(num>0){
			 int digit=num%10;
			 sum=sum*10+digit;
			 num=num/10;
		}

		System.out.printf("INPUT %d   OUTPUT   %d  ",temp,sum);
	}

	
}