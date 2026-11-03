
class Car{

	 static {
	 	 System.out.println("static Block car");
	 }
}

public class Example03 {

	static{
		 System.out.println("static Block");
	}

	public static void main(String[] args) {
		
		Car car1=new Car();
		System.out.println("Hello");
	}
	
}