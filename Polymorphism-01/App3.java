class Operation{
  // method overloading
  
  
   static void doAdd(int x,int y){ 
   	System.out.println(x+y);
   }
   /*
   void doAdd(int x,int y){ 
   	System.out.println(x+y);
   }
   */
   void doAdd(int x,int y,int z){ 
   	System.out.println(x+y+z);
   }
   
}
public class App3 {

	public static void main(String[] args) {

		Operation op=new Operation();
		// Binding of method  at the time compilation called as Compile time Polymorphism
		// Early Binding  static Binding
		op.doAdd(10,20);   // Operation.doAdd(11,22);
		op.doAdd(10,20,30);
	
	
	}
	
}