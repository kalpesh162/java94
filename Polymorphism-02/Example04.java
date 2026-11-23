public class Example04  {

	public static void add(int x,int y){
		System.out.println("add(int,int )  "+ (x+y));
	}
	public static void add(long x,long y){
		System.out.println("add(long,long)" +(x+y));
	}


	public static void main(String[] args) {
		
			add(10,20);
			add(10l,20l);
	}
	
}