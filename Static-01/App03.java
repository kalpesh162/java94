
class Data {
	int x=11;  // instance    non-static 
	static int y=22;  // static   
	
	void display1(){
		 System.out.println("x  "+x);
		 System.out.println("y  "+y);
	}

}

public  class App03 {

	public static void main(String[] args) {
		
		Data d1=new Data();

		System.out.println("x  "+d1.x);
		System.out.println("y  "+d1.y);

		System.out.println("Y  "+ Data.y);

		System.out.println("------");

		d1.display1();

	}
	
}