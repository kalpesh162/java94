/*
AbCdEdCbA
 bCdEdCb
  CdEdC
   dEd
    E
   dEd
  CdEdC
 bCdEdCb
AbCdEdCbA
 */

import java.util.Scanner;
class Example08{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter N");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			
			for(int sp=1;sp<i;sp++)
				System.out.print(" ");

			for(int j=i;j<=n;j++){
				if(j%2==1)
				System.out.print((char)(j+64));
				else
				System.out.print((char)(j+96));
			}

			for(int k=n-1;k>=i;k--){
				if(k%2==1)
				System.out.print((char)(k+64));
				else
				System.out.print((char)(k+96));
			}

			System.out.println();	
		}

		
		for(int i=n-1;i>=1;i--){
			  for(int sp=1;sp<i;sp++)
			  	System.out.print(" ");
			  for(int j=i;j<=n;j++){
				  	if(j%2==1)
					System.out.print((char)(j+64));
					else
					System.out.print((char)(j+96));
			  }
			  	
			  for(int k=n-1;k>=i;k--){
			  		if(k%2==1)	  
						System.out.print((char)(k+64));
					else
						System.out.print((char)(k+96));
				}
			  System.out.println();	
		}
		
	}
	
}