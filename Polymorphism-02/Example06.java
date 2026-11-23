public class Example06  {
	public static void show(byte x){
		System.out.println("byte  "+x);
	}

	public static void show(short x){
		System.out.println("short  "+x);
	}


	public static void main(String[] args) {
		  show(11);  // error: no suitable method found for show(int)  
		 
		  show((byte)11);  // need to give explicit type

	}
	
}