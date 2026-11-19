class Art{

	int x;

    static{
    	System.out.println("Art static Block");  
    }

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
	static{
    	System.out.println("Drawing static Block");  
    }

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

	static{
    	System.out.println("Cartoon static Block");  
    }
	{
		System.out.println("Cartoon Instance Block");
	}
	 Cartoon(){
	 	super();  //z=30
	 	System.out.println("Cartoon Constructor");
	 }
}

public  class Example04 {

	static {
		System.out.println("static Block Example04");
	}

	public static void main(String[] args) {
	
		//Cartoon cartoon=new Cartoon();

		//Cartoon cartoon;
		Cartoon cartoon=null;
	}
	
}