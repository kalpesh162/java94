import java.util.Scanner;
class Example05 {

	public static void main(String[] args) {
			int day;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value ");
		day=scanner.nextInt();

		switch (day) {
			   // case order can be anything
				case 5 : System.out.println("THRUSDAY");break;
			    case 6 : System.out.println("FRIDAY"); break;
			    case 7 : System.out.println("SATDAY");break;
	

			    case 1 : System.out.println("SUNDAY");break;
			    case 2 : System.out.println("MONDAY");break;
			    case 3 : System.out.println("TUEDAY");break;
			    case 4 : System.out.println("WEDDAY");break;
			    
			    default : System.out.println("Not Valid Input ");
			    	break;
			
		}
	}
	
}