import java.util.Scanner;
class Example06 {

	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Num1");
			int num1=scanner.nextInt();
			System.out.println("Enter Num2");
			int num2=scanner.nextInt();
			int res;
			System.out.println("****OPERATION MENU ******");
			System.out.println("\t + \t");
			System.out.println("\t - \t");
			System.out.println("\t * \t");
			System.out.println("\t / \t");
			System.out.println("------------------------------");
			System.out.println("ENTER ");
			char symbol=scanner.next().charAt(0);

			switch (symbol) {
					case '+' : 
						       res=num1+num2;
						       System.out.println("ADD   "+res);  break;
					case '-' : 
							   res=num1-num2;
						       System.out.println("SUB   "+res); break;
					case '*' : 
								res=num1*num2;
						       System.out.println("MUL   "+res);  break;
					case '/' : 
								res=num1/num2;
						       System.out.println("DIV   "+res); break;

					default: System.out.println("NOT VALID OPERATION");
							
			}

	}
	
}