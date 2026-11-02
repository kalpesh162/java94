class Data{
	 int x=11;  // member field  instance field  non-static field
	 
	 static int y=22;  // member field static field  [not part of an Object] [parat of class ]

	 void display1(){  // part of an Object  // instance method
	 	System.out.println("x  "+x);
	 	System.out.println("y  "+y);
	 }
	 // non-static method can access both static as well as non-static member

	 static void display2(){  // Not part of an Object 
			System.out.println("y  "+y);

			//System.out.println("x  "+x);  // x is instance Fiels non-static field
			//non-static variable x cannot be referenced from a static context

			// this can not be accessible in static area
			// that reason you cant access x as instance field

			// Create new Object here then can access x member
			// Data d1=new Data()   d1.x
	 }
}

public  class Example01{
	public static void main(String[] args) {
		Data d1=new Data();

		System.out.println(d1.x);
		System.out.println(d1.y);
		//Data.y
		System.out.println(Data.y);

		d1.display1();

		System.out.println("---------");
		//d1.display2();  // display2 is static method
		
		// d1.display2();  d1--> Data  -->  Data.display2(this*)
		Data.display2();
		// When we make method as a static
		// 1 : when we call method without creating an Object
	}
}