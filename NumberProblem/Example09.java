/*

🔢 Problem 4: Second Digit (From Left)
📜 Task: Return the second digit from the left.
Input:
1234
Output:
2
*/
import java.util.Scanner;
class Example09 {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter num1 :  ");
		num=scanner.nextInt();
		
		while(num>100)
			num=num/10;

		System.out.println(num%10);

	}
	
}