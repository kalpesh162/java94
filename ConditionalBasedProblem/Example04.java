// to compute Grade for Marks
import java.util.Scanner;
class Example04 {

	 	public static void main(String[] args) {

        int marks;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENter Marks :   " );
        marks=scanner.nextInt();

        // validate 
        if(marks<0 || marks>100){
            System.out.println("Enter Valid Marks");
            System.exit(1);
        }

        if(marks<=40){
            System.out.println("D");
        }
        else if(marks<=65){
            System.out.println("C");
        }
        else if(marks<=80){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }
            
        }
}
