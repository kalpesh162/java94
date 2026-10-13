/*Write a  Java  program to find all prime factors of a number.*/
import java.util.Scanner;
class Example05 {
	
	static boolean isPrime(int num){
		if(num==0 || num==1) return false;

		boolean flag=true;
		for(int i=2;i<num;i++){
			  if(num%i==0){
			  	 flag=false;
			  	 break;
			  }
		}
		return flag;
	}

	static void printFactors(int num){
		System.out.println("");
		for(int i=1;i<num;i++){
			  if(num%i==0 && isPrime(i))
			  	System.out.print(i +" |  ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num");
		int num=scanner.nextInt();

		printFactors(num);
		
	}
	
}