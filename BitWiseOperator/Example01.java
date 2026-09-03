/*
Bitwise &
Bitwise |
Bitwise ^
A        B      A & B       A | B       A^B
--------------------------------------------
0        0        0           0          0
0        1        0           1          1
1        0        0 		  1	         1
1		 1        1           1          0
--------------------------------------------
*/
class Example01{
	public static void main(String[] args) {
		int x=5;
		int y=10;

		System.out.println("&  "+(x&y));   // 0
		System.out.println("|  "+(x|y));   // 15 
		System.out.println("^  "+(x^y));   // 15
	}
}