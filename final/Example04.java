class Point{
	 final int x; final int y;  // final as instance variable
                                
	  Point(int x,int y){
	  	 this.x=x; this.y=y;
	  }

	  // should write setter getter

	  public String toString(){
	  	 return "X  "+x +"  Y  " +y;
	  }

	  double distance(){
	  			Point p=new Point(0,0);
	  		 return (this.x-p.x)/(1.0*(this.y-p.y));
	  }

	   double distance(final Point p){   // Good Programming Prcatice parameter ref as a final
	  			// p=new Point(0,0);
	  		 

	  		 return (this.x-p.x)/(1.0*(this.y-p.y));
	  }
}

public class Example04  {

	public static void main(String[] args) {
		
		final Point p1=new Point(11,22);   // Here we make final as a referenece
		System.out.println(p1);
`
	//	p1.x=33;
	//	p1.y=44;
		//p1=new Point(44,55);

		System.out.println(p1);

		double dist=p1.distance();
		System.out.println(dist);

		System.out.println("-----------------------------");

		Point p2=new Point(2,2);

		p1.distance(p2);




	}
	
}