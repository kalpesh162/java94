class Instrument{
   // .. data
   void play(){
   	System.out.println("Instrument :: play");
   }
  // .. methods
}
class Guitar extends Instrument{
    // data
    @Override  // Annotation
	void play(){
   	System.out.println("Guitar :: play");
   }
   // method
}

class Violin extends Instrument{
	@Override  // Annotation
	void play(){
   	System.out.println("Violin :: play");
   }

}

class Tabla extends Instrument{
	@Override  // Annotation
	void play(){
   	System.out.println("Tabla :: play");
   }

}

public class App{

	static void tune(Instrument i1){
        i1.play();
	}
	static void tune(Guitar g1){
        g1.play();
	}
	static void tune(Violin v1){
        v1.play();
	}
	static void tune(Tabla t1){
        t1.play();
	}


	public static void main(String[] args) {

		//Instrument i1=new Guitar();
		//i1.play();

		Instrument i1=new Instrument();
		Guitar g1=new Guitar();
		Violin v1=new Violin();
		Tabla t1=new Tabla();

		tune(i1);
		tune(g1);
		tune(v1);
		tune(t1);

		
	}

}