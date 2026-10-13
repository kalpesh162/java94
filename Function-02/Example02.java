// Write a code enter year to check leap year if leap year then do sumOfDigit 
// if nonleap year product f digit
import java.util.Scanner;
class Example02 {

	static boolean isLeapYear(int year){
		  return (year%100!=0 && year%4==0) || (year%400==0) ? true : false;
	}

	static int sumOfDigits(int n){
		 int sum=0;
		 while(n>0){
		 	 sum=sum+n%10;
		 	 n=n/10;
		 }
		 return sum;
	}

	static int productOfDigits(int n){
		 int sum=1;
		 while(n>0){
		 	 sum=sum*(n%10);
		 	 n=n/10;
		 }
		 return sum;
	}
	
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter N ..");
			int year=scanner.nextInt();

			boolean flag=isLeapYear(year);

			if(flag){
				int resSum=sumOfDigits(year);
				System.out.println("sumOfDigits  "+resSum);
			}
			else{
				int resProduct=productOfDigits(year);
				System.out.println("productOfDigits  "+resProduct);
			}

	
	}
	
}