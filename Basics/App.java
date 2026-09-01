class App{
	public static void main(String[] args) {
		// Camel Case Naming Convention
		boolean isOn=false;
		byte byteValue=50;
		char letter='A';   
		short maxRuns=18426;
		int  salary=50000;
		long population=7888467;
		float pi=3.14f;
		double gravity=9.8;

		//System.out.print("Boolean ");
		//System.out.println(isOn);
		System.out.println("Boolean "+isOn);
		System.out.println("Byte "+byteValue);
		System.out.println("Character "+letter);
		System.out.println("Short "+maxRuns);
		System.out.println("Integer "+salary);
		System.out.println("Long "+population);
		System.out.println("Float "+pi);
		System.out.println("Double "+gravity);

		System.out.println("-----------------");
		//byte x=7;
		byte x=0b111;
		System.out.println(x);

		//octal  111 --> 157

		// hexa  111  -->6F

		int octal=0157;
		System.out.println(octal);
		int hexa=0x6F;
		System.out.println(hexa);


	}
}