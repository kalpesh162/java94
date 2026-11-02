class A{
	 // data

    private A(){

    }

    public static A getA(){
    	 return new A();
    }

    // instance method
}

public class Example04 {
		public static void main(String[] args) {
			
		// A a1=new A();  Not Able to create Object

			A a1=A.getA();

		}
	
}
