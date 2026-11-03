
class Bird{
	int x;

// static Block
static {
	System.out.println("Bird :: static Block");
}

// instance Block
	{
		System.out.println("instance Block  x:  "+x);
		x=10;
	} 
//Constructor
	Bird(){
		System.out.println("Bird:: Constructor" +x  );
		x=20;
	}

}


public class Example04  {

	public static void main(String[] args) {
			
			Bird b1=new Bird();
			System.out.println(b1.x);
	}
	
}