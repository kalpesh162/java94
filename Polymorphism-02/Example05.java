public class Example05  {
	
	public static void add(int x,long y){
		System.out.println("add(int,long )  "+ (x+y));
	}
	
	
	public static void add(long x,int y){
		System.out.println("add(long,int)" +(x+y));
	}

	public static void main(String[] args) {
		
			add(10,20);
			
	}
	
}

/*
 reference to add is ambiguous
                        add(10,20);
                        ^
  both method add(int,long) in Example05 and method add(long,int) in Example05 match
*/