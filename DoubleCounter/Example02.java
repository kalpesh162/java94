/*
15 13 10 6 1
14 11 7  2
12 8  3
9  4
5
---------------------
1  2  3  4  5
2  3  4  5
3  4  5
4  5
5

----------------------

for(int i=1;i<=n;i++){

for(int j=i;j<=n;j++){

}

}

15 13 10 6 1
14 11 7  2
12 8  3
9  4
5

 int cnt=n*(n+1)/2;

for(int i=1;i<=n;i++){
	int c=cnt;
for(int j=i;j<=n;j++){
		System.out.print(c+"\t");
		c=c-j-1;
}

   cnt=cnt-i;

}
*/


class Example02 {

	public static void main(String[] args) {
			int n=5;
			
			int cnt=n*(n+1)/2;

			for(int i=1;i<=n;i++){
				int c=cnt;
				for(int sp=1;sp<i;sp++)
					System.out.print("\t");

				for(int j=i;j<=n;j++){
						System.out.print((char)(c+64)+"\t");
						c=c-j-1;
				}

			   cnt=cnt-i;
			   System.out.println();

		}

	}
	
}