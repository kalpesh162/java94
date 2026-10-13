/*
Write a  Java  program to find the frequency of each digit in a given integer.

int num=12341111;
int digit=1

result --> 5
*/
import java.util.Scanner;
class Example01 {
	 static int frequencyDigits(int num,int x){
		int cnt=0;
		while(num>0){
			  int rem=num%10;
			  if(rem==x) cnt++;
			  num=num/10;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num");
		int num=scanner.nextInt();
		System.out.println("Enter Digit to find Frequency");
		int x=scanner.nextInt();

		int cnt=frequencyDigits(num,x);

		System.out.printf("NUM:  %d  x: %d  cnt:  %d",num,x,cnt);
		
	}
	
}