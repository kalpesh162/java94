import java.util.Scanner;
/*
A       A
Ab     bA
AbC   CbA
AbCd dCbA
AbCdEdCbA
AbCd dCbA
AbC   CbA
Ab     bA
A       A
*/
class Example07{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			  if(i==n){
			  	 for(int j=1;j<=n;j++){
			  	 	if(j%2==1)
			  	 	System.out.print((char)(j+64));
			  	 	else
			  	 	System.out.print((char)(j+96));
			  	 }
			  	 for(int j=n-1;j>=1;j--){
			  	 	if(j%2==1)
			  	 	System.out.print((char)(j+64));
			  	 	else
			  	 	System.out.print((char)(j+96));
			  	}

			  }else{
			  	   for(int j=1;j<=i;j++){
			  	   	if(j%2==1)
			  	 	System.out.print((char)(j+64));
			  	 	else
			  	 	System.out.print((char)(j+96));
			  	   }
			  	   	
			  	   for(int sp=1;sp<(2*(n-i));sp++)
			  	   	System.out.print(" ");

			  	   for(int j=i;j>=1;j--){
			  	   	if(j%2==1)
			  	 	System.out.print((char)(j+64));
			  	 	else
			  	 	System.out.print((char)(j+96));
			  	   }

			  }
			  System.out.println();
		}

		for(int i=n-1;i>=1;i--){
			  for(int j=1;j<=i;j++){
			  	if(j%2==1)
			  	 	System.out.print((char)(j+64));
			  	 	else
			  	 	System.out.print((char)(j+96));
			  }

			  for(int sp=1;sp<2*(n-i);sp++)
			  	System.out.print(" ");

			  for(int j=i;j>=1;j--){
			  	if(j%2==1)
			  	 	System.out.print((char)(j+64));
			  	 	else
			  	 	System.out.print((char)(j+96));

			  }
			  	  System.out.println();

		}

	}
}