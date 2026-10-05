import java.util.Scanner;
// Leap Year
class Example04{
	public static void main(String[] args) {
		int year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value ");
		year=scanner.nextInt();
		
		if(year<0){
			System.out.println("Invalid Input");
			System.exit(1);
		}
	
		String isLeapYear=(year%100!=0  && year%4==0 ) ? "Leap Year " : (year%400==0) ? "Leap Year" : "Not Leap Year";

		String checkLeapYear=(year%100!=0  && year%4==0  || year%400==0) ? "Leap" : "Not Leap Year";

		System.out.println(isLeapYear);

	
	}
}