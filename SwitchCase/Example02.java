import java.util.Scanner;
class Example02 {

	public static void main(String[] args) {
			int day;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value ");
		day=scanner.nextInt();
		int x=3;
		// case value must be CONSTANT
		// WHAT IS CONSTANT > INTEGER  DECIMAL  CHARCTER   STRING
		//   0  '0'  "0"

		switch (day) {

			    case 1   : System.out.println("SUNDAY");break;
			    case 2   : System.out.println("MONDAY");break;
			    case 3   : System.out.println("TUEDAY");break;
			    case 4   : System.out.println("WEDDAY");break;
			    //constant expression required
			    //case x+2 : System.out.println("THRUSDAY");break;
			    case 3+2 : System.out.println("THRUSDAY");break;

			    	// 3 AND 2 ARE CONSTANT   CONSTANT expression are evaluated at Compile Time
			    case 5 : System.out.println("THRUSDAY");break;
			    	//duplicate case label
			    case 6   : System.out.println("FRIDAY"); break;
			    case 7   : System.out.println("SATDAY");break;

			    default : System.out.println("Not Valid Input ");
			    	break;
			
		}
	}
	
}