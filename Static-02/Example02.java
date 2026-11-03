// Why main method as static
// Because internally JVM Call main method on Class Name
// Its good rather than creating Object and memory to call start

// Whats the use of String args[]
class Example02 {
	
	public static void main(String[] args) {
		System.out.println("===>  "+args.length);

		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);  // Integer.parseInt(args[i])

	}

}

// 1: run code then give input
// Addition You Run Program First
// Enter input
// Enter input
// result

//----------------------------------
// When you run code at the time you want give input

// Command Line Input

// javac is program
// javac Hello.java

/*
// Command Line Input
E:\JAVA-WorkSpace-JAP-94\Static-02>java Example02 11 22 33 "Hello"  11.11 true
===>  6
11
22
33
Hello
11.11
true

*/








