// To implement Singlton Design Pattern
class Tv{
	 // data

	private static Tv tv;

    private Tv(){

    }

    public static Tv getTv(){
    	 if(tv==null){
    	 	 tv=new Tv();
    	 }
    	 return  tv;
    }
    // instance method
}

public class Example05 {
		public static void main(String[] args) {
			
			Tv tv1=Tv.getTv();
			Tv tv2=Tv.getTv();
			Tv tv3=Tv.getTv();

		}
	
}
