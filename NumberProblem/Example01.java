/* Find the power of any number using a for loop */
/*  base  exponent   2  3*/
import java.util.Scanner;
class Example01 {

	public static void main(String[] args) {
		int x; int y;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter x :  ");
		x=scanner.nextInt();
		System.out.println(" Enter y :  ");
		y=scanner.nextInt();
		
		int val=y;
		
		int res=1;
		while(y>=1){
			res=res*x;
			y--;
		}

		System.out.printf("x:%d ^  y: %d  =  %d",x,val,res);
		
	}
	
}