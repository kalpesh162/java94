/*Print all factors of a given number ONLY EVEN*/

// num=16   1  2  4  8  

import java.util.Scanner;
class Example03 {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter num :  ");
		num=scanner.nextInt();
		
		for(int i=1;i<num;i++){
			 if(num%i==0  && i%2==0){
			 	System.out.print(i +" ");
			 }
		}

		
	}
	
}