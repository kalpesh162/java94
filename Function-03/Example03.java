/*Write a  Java  program to check whether a number is a Prime number or not.*/
import java.util.Scanner;
class Example03 {
	
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

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num");
		int num=scanner.nextInt();

		if(num<0){
			System.out.println("Enter Only Whole Numbers ...");
			System.exit(1);
		}
		
		boolean yesOrNo=isPrime(num);
		if(yesOrNo){
			System.out.println("No is Prime  "+num);
		}
		else{
			System.out.println("No is NOT Prime  "+num);
		}

		
	}
	
}