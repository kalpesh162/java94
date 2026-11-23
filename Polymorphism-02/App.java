class Instrument {
	void play(){
		System.out.println("Instrument :: play");
	}
}
class Guitar extends Instrument{

	void play(){
		System.out.println("Guitar :: play");
	}

}
class Violin extends Instrument{

	void play(){
		System.out.println("Violin :: play");
	}

}

class Tabla extends Instrument{

	void play(){
		System.out.println("Tabla :: play");
	}

}

public class App  {

	public static void main(String[] args) {

		Instrument i1=new Instrument();
		i1.play();

		Guitar g1=new Guitar();
		g1.play();

		Violin v1=new Violin();
		v1.play();

		Tabla t1=new Tabla();
		t1.play();

        // Guitar is a type of Guitar
        //Guitar is a type of Instrument
        //Guitar is a type of Object

		Instrument i2=new Guitar();  // UPCASTING
		// Parent ref holding or pointing child class object
		i2.play();

		// Binding of method call decides at runtime called as Runtime Polymorphism

		Instrument i3=new Violin();
		i3.play();
	}
	
}