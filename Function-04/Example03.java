
/*Write a  Java  program to check whether a number is a Perfect number or not. */

import java.util.Scanner;
class Example03 {
	static boolean isPerfect(int num){
		int sum=0;
		for(int i=1;i<=num/2;i++){
		   if(num%i==0) 
		   	sum=sum+i;
		}
		return sum==num;
	}

	public static void main(String[] args) {
		int num;
		System.out.println("Enter NUM");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		for(int i=1;i<=num;i++){
			if(isPerfect(i))
				System.out.println(i);
		}

	}
	
}