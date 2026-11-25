class Point{
	  private int x;
	  private int y;

	  Point(){ }
	  Point(int x,int y){
	  	  this.x=x; this.y=y;
	  }

	  public void setX(int x){ this.x=x;}
	  public void setY(int y){ this.y=y;}
	  public  int getX(){ return x;}
	   public  int getY(){ return y;}

	   public void displayPoint(){
	   	 System.out.println(x+"  "+y);
	   }
}

public class Example01  {

	public static void main(String[] args) {

		Point p1=new Point(11,22);

		System.out.println(p1); // Point@15db9742
		
	}
	
}