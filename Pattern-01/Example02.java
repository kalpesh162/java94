
// ASCII CODE 
// A 65  B 66  
// a 97  b 98
//   32
// 0 48  1 49 

// UNICODE   UTF UNICODE TEXT FORMAT
// utf - 8bit
// utf -16 bit
// utf -32 bit

//(chote wala type)type

//short val=9999;

//short val=(short)9999;

// Widening
//long number=(long)2147483647;  type promotion

// Narrowing
// char letter=(char)(i+64);

/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
*/

class Example02 {

	public static void main(String[] args) {
			int n=5;
			for(int i=1;i<=n;i++){
				 for(int j=1;j<=5;j++)
				 	System.out.print((char)(i+64));
				 System.out.println();
			}
	}
	
}