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

class Flute extends Instrument{
	@Override  // Annotation
	void play(){
   	System.out.println("Flute :: play");
   }

}


public class App3{
   // Instrument i1=g1; UPCASTING
	static void tune(Instrument i1){
        i1.play();
	}

	static void orchestra(Instrument arr[]){    // array of instrument
		   // Instrument i=new Instrument();  1
		// Instrument i=new Guitar();  2
		// Instrument i=new Flute();  3
		// Instrument i=new Violin();  4
		 for(Instrument i:arr)   // UPCASTING
		 	  // this i ref above code 
         tune(i);
          // tune(i)  calls
	}


	public static void main(String[] args) {

		Instrument arr[]={new Instrument(),new Guitar(),new Flute(),new Violin()};

		orchestra(arr);  // CALL
		
	}

}