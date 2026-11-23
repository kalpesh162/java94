// Can we overload main method ?
public class Example01{
	public static void main(String[] args) {
		
	}

	public static void main(Integer[] args) {
		
	}

		public static void main(int[] args) {
		
	}
    
    // can we overload private methods
	private void f1(int x){}
	private void f1(double x){}
}