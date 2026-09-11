/*
11 11 11 11 11
22 22 22 22 22
33 33 33 33 33
44 44 44 44 44
55 55 55 55 55
*/
class Example04 {

	public static void main(String[] args) {
			int n=5;
			for(int i=1;i<=n;i++){
				 for(int j=1;j<=5;j++)
				 	System.out.print(11*i +" ");
				 System.out.println();
			}


			System.out.println();

			
			for(int i=1;i<=n;i++){
				 for(int j=1;j<=5;j++)
				 	System.out.print(i+""+i+" ");
				 System.out.println();
			}

			System.out.println();

			
			for(int i=1;i<=n;i++){
				 for(int j=1;j<=5;j++)
				 	System.out.print((char)(64+i)+""+(char)(64+i)+" ");
				 System.out.println();
			}
	}
	
}