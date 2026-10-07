/*Calculate the factorial of a number*/

import java.util.Scanner;
class Example04 {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter num :  ");
		num=scanner.nextInt();
		int res=1;
		for(int i=1;i<=num;i++){
				res=res*i;
		}
		System.out.println(res);
	}
	
}