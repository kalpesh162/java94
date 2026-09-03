
class TestOperator {

	public static void main(String[] args) {
		
		int n1=11; int n2=3;

		//int add=n1+n2;

		System.out.println("Addition        "+(n1+n2));
		System.out.println("Subtraction     "+(n1-n2));
		System.out.println("Multiplication  "+(n1*n2));
		System.out.println("Division        "+(n1/n2));
		System.out.println("Modulus         "+(n1%n2));

		double div=n1/n2;
		System.out.println("Division         "+div);
		System.out.println("Division         "+(11/3.0));
        // NOte Point  int/int  --> int
        // double/int --->double
        // int/double---> double
        // double/double --->double
	}
	
}