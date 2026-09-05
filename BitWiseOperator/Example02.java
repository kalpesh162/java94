
class Example02{
	public static void main(String[] args) {
		int x=5;
		int y=10;

		System.out.println("X  "+x);
		System.out.println("Y  "+y);

		x=x^y;
		y=x^y;
		x=x^y;

		System.out.println("X  "+x);
		System.out.println("Y  "+y);

	}
}

