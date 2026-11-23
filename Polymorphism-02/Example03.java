public class Example03 {

	public static void show(byte x){
		System.out.println("byte  "+x);
	}

	public static void show(short x){
		System.out.println("short  "+x);
	}


	public static void show(int x){
		System.out.println("int .. "+x);
	}

	public static  void show(long x){
		System.out.println("long  "+x);
	}
	public static  void show(double x){
		System.out.println("double  "+x);
	}
	public static  void show(float x){
		System.out.println("float  "+x);
	}


	public static void main(String[] args) {
		
		System.out.println(1211122);

		byte num=121;

		// Type Promotion 

		// byte num=(byte)121;
		int x=13131;
		long y=x;
		//long y=(long)x;

		show(num);
		show(121);
	}
	
}