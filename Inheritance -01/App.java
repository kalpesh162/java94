class A{
	 int x=11;

	 void f1(){
	 	 System.out.println(x);
	 } 
}
class B extends A{
	int y=22;

	void f2(){
		System.out.println(y);
	}
}

public  class  App {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.x);
		a1.f1();

		System.out.println(" -----------------------------");

		 B b1=new B();
		System.out.println(b1.x);
		System.out.println(b1.y);
		b1.f1();
		b1.f2();

	}
	
}