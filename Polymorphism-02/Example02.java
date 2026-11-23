public class Example02  {
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
		  show(11);  // Note this 11 treat as 11 as int type 
		  show((short)11);  // then here as 11 as int so convert into short
		  show((byte)11);
		  show(11.11);  // By default 11.11 as double 
		  //  show((float)11.11);
		    show(11.11f);

	}
	
}