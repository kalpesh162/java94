
class Point{
	int x;
	static int y;

	Point(){ x=0; y=0;}
	/*
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	*/
	// static Block
	static  {
		y=0;
	}

	Point(int x){
		 this.x=x;
	}

}


public  class Example01 {

	public static void main(String[] args) {
		Point p1=new Point(11);
		
	}
	
}