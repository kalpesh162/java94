class A{
    int x=11;

	void f1(){
		System.out.println("A class f1()");
	}
}
class B extends A{
	int x=111;

	void f1(){
		System.out.println("B class f1()" +x);
	}

	void f2(){
	System.out.println("B class f2()");	
	}
}
class App01{
	public static void main(String[] args) {
		  
		  A a1=new B();
		  a1.f1();
		  System.out.println(a1.x); 
		 
		 // a1.f2();  
	}
}