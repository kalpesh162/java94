
class Art{
	int x;
	{
		System.out.println("Art Instance Block");
	}
	 Art(){
	 	super();   //x=10
	 	System.out.println("Art Constructor");
	 }
}
class Drawing extends Art{
	int y;
	{
		System.out.println("Drawing Instance Block");
	}
	 Drawing(){
	 	super();  // y=20
	 	System.out.println("Drawing Constructor");
	 }
}
class Cartoon extends Drawing{
	int z;
	{
		System.out.println("Cartoon Instance Block");
	}
	 Cartoon(){
	 	super();  //z=30
	 	System.out.println("Cartoon Constructor");
	 }
}

public  class Example01 {

	public static void main(String[] args) {
		
		Cartoon cartoon=new Cartoon();
	}
	
}