class Operation{
  // method overloading
  // we can overload static method
  // that method gets memmory on Class Area
   static void doAdd(int x,int y){ 
   	System.out.println(x+y);
   }
   static void doAdd(int x,int y,int z){ 
   	System.out.println(x+y+z);
   }
   static  void doAdd(int x,double y){ 
   	System.out.println(x+y);
   }
   static void doAdd(double x,int y){ 
   	System.out.println(x+y);
   }
}
public class App2 {

	public static void main(String[] args) {

		Operation op=new Operation();
		// Binding of method  at the time compilation called as Compile time Polymorphism
		// Early Binding  static Binding
		op.doAdd(10,20);   // Operation.doAdd(11,22);
		op.doAdd(10,20,30);
		op.doAdd(10,22.22);
		op.doAdd(10.10,22);


		new Operation().doAdd(11,22);	

		// Anonymous Object
		
	}
	
}