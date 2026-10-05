import java.util.Scanner;
class Example03 {

	public static void main(String[] args) {
			int  day;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Value ");
		day=scanner.nextInt();

		switch (day) {

				/*
				Eror: incompatible types: possible lossy conversion from double to int
                            case 1.0 : System.out.println("SUNDAY");break;
                 */
				// case 'A' :  // Allow

			//  case 3.14  :   not Allow

				case "AAA" : 
			    
			    case 1.0 : System.out.println("SUNDAY");break;
			    case 2 : System.out.println("MONDAY");break;
			    case 3 : System.out.println("TUEDAY");break;
			    case 4 : System.out.println("WEDDAY");break;
			    case 5 : System.out.println("THRUSDAY");break;
			    case 6 : System.out.println("FRIDAY"); break;
			    case 7 : System.out.println("SATDAY");break;

			    default : System.out.println("Not Valid Input ");
			    	break;
			
		}
	}
	
}