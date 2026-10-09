import java.util.Scanner;
/* Write a  program to enter the radius of a circle and find its diameter, circumference and area.*/
class Example03 {

	static void diameter(double r){
			double dia=2*r;
			System.out.println("diameter :"+dia);
	}
	static void circumferenceOfCircle(double r){
			double  circumference=2*3.14*r;
			System.out.println("circumference : "+circumference);
	}
	static void areadOfCircle(double r){
		  double area=3.14*r*r;
		  System.out.println("Area  "+area);
	}
	
	public static void main(String[] args) {
		double radius;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Radius :");
		radius=scanner.nextDouble();	
		diameter(radius);
		circumferenceOfCircle(radius);
		areadOfCircle(radius);
	}
	
}