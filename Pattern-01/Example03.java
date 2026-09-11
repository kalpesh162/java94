/*
EEEEE
DDDDD
CCCCC
BBBBB
AAAAA
*/
class Example03 {

	public static void main(String[] args) {
			int n=5;
			for(int i=n;i>=1;i--){
				 for(int j=1;j<=5;j++)
				 	System.out.print((char)(i+64));
				 System.out.println();
			}
	}
	
}