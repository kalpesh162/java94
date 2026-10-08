/*
🔢 Problem 8: Append Sum of Digits at the Beginning
📜 Task: Prepend the sum of digits to the beginning of the number.
Input:
1234

Output:
101234
*/
import java.util.Scanner;
public  class Example13{
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
		int multiplier=1;
		// STEP 2 SUMOF DIGIT
		int sum=0;
		while(num>0){
			 sum=sum+num%10;
			 num=num/10;
			 multiplier=multiplier*10;
		}

		int res=sum*multiplier+temp;
		System.out.println(res);

	}
}