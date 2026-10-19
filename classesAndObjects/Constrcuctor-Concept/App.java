class Rock{
	int i;
	// Why
	Rock(){
		System.out.println("Constructor Called");
		i=10;
	}
}

class App {

	public static void main(String[] args) {
			Rock r1=new Rock();
			Rock r2=new Rock();
			Rock r3=new Rock();
			Rock r4=new Rock();
			Rock r5=new Rock();
	}
	
}