class Operation{
  // method overloading
   void doAdd(int x,int y){ 
   	System.out.println(x+y);
   }
   void doAdd(int x,int y,int z){ 
   	System.out.println(x+y+z);
   }

    void doAdd(int x,double y){ 
   	System.out.println(x+y);
   }

   void doAdd(double x,int y){ 
   	System.out.println(x+y);
   }

}
public class App {

	public static void main(String[] args) {

		Operation op=new Operation();
		// Binding of method  at the time compilation called as Compile time Polymorphism
		// Early Binding  static Binding
		op.doAdd(10,20);
		op.doAdd(10,20,30);
		op.doAdd(10,22.22);
		op.doAdd(10.10,22);	
	}
	
}