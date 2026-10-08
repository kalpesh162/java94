/*
🔢 Problem 10: Shift First Digit to Last
📜 Task: Move the first digit to the end.
Input:
1234

Output:
2341
*/
import java.util.Scanner;
class Example15 {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1  ");
		num=scanner.nextInt();

		int multiplier=1;
		int temp=num;

		// count digits  digits=4
		// 
		while(temp>9){
			multiplier=multiplier*10;
			temp=temp/10;
		}

		int res=(num%multiplier)*10+num/multiplier;

		System.out.println(res);

		}	
	}