/*
Ex No 3:
Write a program that displays a menu and prints different star (*) patterns based on the user's choice.

Menu Options
1 : Hollow Square
Print an N × N square where stars appear only on the border.
2 :Solid Rhombus
Print a solid rhombus of side N leaning to the left.
The first row has the maximum leading spaces, decreasing in each row.
3: Mirrored Rhombus
Print a solid rhombus of side N leaning to the right.
The first row has 0 leading spaces, increasing in each row.

*/
import java.util.Scanner;
class Square {

	public static void main(String[] args) {
		
		int N;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No Of Rows");
		N=scanner.nextInt();
		int choice;char letter;

		do{

		System.out.println("**************************");
		System.out.println(" 1  :   SQUARE    ");
		System.out.println(" 2  :   ROHMBUS    ");
		System.out.println(" 3  :   HOLLOW SQUARE    ");
		System.out.println("**************************");

		System.out.println("Enter YOUR CHOICE  ");
		choice=scanner.nextInt();	

		switch(choice){

		case 1 :
			   {
			   	   for(int i=1;i<=N;i++){
			   	   	for(int j=1;j<=N;j++){
			   	   		System.out.print("*");
			   	   	}
			   	   	System.out.println();
			   	   }

			   }
			   break;

		case 2 :
				{
					for(int i=1;i<=N;i++){

						 for(int sp=i;sp<N;sp++)
						 	System.out.print(" ");

			   	   		for(int j=1;j<=N;j++){
			   	   			System.out.print("*");
			   	   		}
			   	   	System.out.println();
			   	   }

				}
				break;

		case 3 :
			{
				for(int i=1;i<=N;i++){
			   	   	for(int j=1;j<=N;j++){
			   	   		if(i==1 || i==N || j==1 || j==N)
			   	   		System.out.print("*");
			   	   		else
			   	   		System.out.print(" ");
			   	   	}
			   	   	System.out.println();
			   	   }
			}
				break;

		case 4 : System.out.println("THANK YOU ");
				System.exit(0);
		}

		System.out.println("DO YOPU WANT TO CONTINUE  PRESS Y | y");
		letter=scanner.next().charAt(0);
	}while(letter=='Y' || letter=='y');

	}
	
}

