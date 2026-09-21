/*
A       F       J       M       O
        B       G       K       N
                C       H       L
                        D       I
                                E
*/
class Example01 {

	public static void main(String[] args) {
			int n=5;
			int cnt=1;
			for(int i=1;i<=n;i++){
				int c=cnt;

			for(int sp=1;sp<i;sp++)
			System.out.print("\t");

			for(int j=n;j>=i;j--){
				System.out.print((char)(c+64)+"\t");
				c=c+j;
			}

			System.out.println();
			cnt++;

		}


	}
	
}