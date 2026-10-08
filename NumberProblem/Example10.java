/*
🔢 Problem 6: Average of Digits
📜 Task: Calculate the average of all digits.
Input:
1234

Output:
2.5
*/
import java.util.Scanner;
class Example10 {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter num1 :  ");
		num=scanner.nextInt();
		
		int sum=0; int digits=0;

		while(num>0){
			 sum=sum+num%10;
			 num=num/10;
			 digits++;
		}		


		double avg=sum/(digits*1.0);

		System.out.println(avg);
	}
	
}