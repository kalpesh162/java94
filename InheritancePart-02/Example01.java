/*
public class java.lang.Object{
	Object(){}
}
*/

// MultiLevel Inheritance
class Art{
	Art(){
		super();  // must be the first stamt in the constructor
		System.out.println("Art Constructor");
	}
}

class Drawing extends Art{
	Drawing(){
		super();  // must be the first stamt in the constructor
		System.out.println("Drawing Constructor");
	}

}
class Cartoon extends Drawing{
	Cartoon(){
		this(11);  // must be the first stamt in the constructor
		//super();  //error: call to super must be first statement in constructor
		System.out.println("Cartoon Constructor");
	}
	Cartoon(int x){
		
		System.out.println("Cartoon Parameterized Constructor "+x);
	}
}

public class Example01{
	public static void main(String[] args) {

		Art art=new Art();
		System.out.println();
		Drawing draw=new Drawing();
		System.out.println();
		Cartoon cartoon=new Cartoon();

	}
}