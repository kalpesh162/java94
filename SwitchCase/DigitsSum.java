/*
Calculate the sum of digits of any number

1234  = 10
*/
import java.util.Scanner;
class DigitsSum {
	
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		
		int temp=num;
		int sum=0;  // dabba
		
		while(num>0){
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}

		System.out.println(sum);
		System.out.printf("INPUT %d   OUTPUT   %d  ",temp,sum);
		
	}
}