/*
🔢 Problem 7: Append Sum of Digits at the End
📜 Task: Append the sum of digits to the end of the number.
Input:
1234

Output:
123410
temp   sum
1234   10

*/
import java.util.Scanner;
public  class Example12{
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num  ");
		num=scanner.nextInt();

		// Validate
		if(num<0){            
			 num=num*-1;   // num=Math.abs(num);
		}

		// STEP 1  COPY Oroginal NUm
		int temp=num;

		// STEP 2 SUMOF DIGIT
		int sum=0;
		while(num>0){
			 sum=sum+num%10;
			 num=num/10;
		}

		//  ADD SUM TO THE COPY NUM
		if(sum<10)
		temp=temp*10+sum;

		if(sum>=10)
		temp=temp*100+sum;

		System.out.println(temp);
		
	}
}