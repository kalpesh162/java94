class Point{
	 final int x; final int y;  // final as instance variable
                                
	  Point(int x,int y){
	  	 this.x=x; this.y=y;
	  }

	  // should write setter getter

	  public String toString(){
	  	 return "X  "+x +"  Y  " +y;
	  }
}

public class Example03  {

	public static void main(String[] args) {
		
		final Point p1=new Point(11,22);   // Here we make final as a referenece
		System.out.println(p1);

	//	p1.x=33;
	//	p1.y=44;
		p1=new Point(44,55);

		System.out.println(p1);


	}
	
}