/*Write a Java program to print a multiplication table of any number.*/
import java.util.Scanner;
class TableWithFormat{
	
	public static void main(String[] args) {
	
		for(int i=1;i<=10;i++){
			  for(int j=1;j<=10;j++){
			  	  //System.out.print(i*j +"  ");  printf()   // printf(format,name)

			  		//System.out.printf("%4d",i*j);  // %d  decimal   %f 11.11  %s %b %c
			  		System.out.printf("%-4d",i*j);  // %d  decimal   %f 11.11  %s %b %c


			  }
			  System.out.println();
		}

		
	}
}

