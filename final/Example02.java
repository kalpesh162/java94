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

public class Example02  {

	public static void main(String[] args) {
		
		Point p1=new Point(11,22);
		System.out.println(p1);

	//	p1.x=33;
	//	p1.y=44;

		System.out.println(p1);


	}
	
}