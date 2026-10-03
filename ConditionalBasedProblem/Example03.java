   Write a  Java  program to check whether a number is divisible by 5 and 11 or not.
/*Write a  Java  program to check whether a number is divisible by 5 and 11 or not.*/
// divisible  by both
// divisible  by only 5
// divisible  by only 11
// divisible  not by both
import java.util.Scanner;
class Example03 {

	 	int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENter NUM  to Check divisible by 5 , 11 :  " );
        num=scanner.nextInt();

        if(num%5==0  && num%11==0){
        	System.out.println("divisible by both");
        }
        else if(num%5==0){
        	System.out.println("divisible by 5");	
        }
        else if(num%11==0){
			System.out.println("divisible by 11");
        }
        else{
        	System.out.println("divisible  not by both");	
        }
	
}
