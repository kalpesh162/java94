import java.util.Scanner;
import java.util.Random;
public class ExampleNo18 {

	public static void init_Array(int A[]){
		Random random=new Random();
		for(int i=0;i<A.length;i++){
			 A[i]=random.nextInt(10000);
		}
	}
	public static void displayArray(int A[]){
		for(int i=0;i<A.length;i++)
		System.out.printf("%-7d  :  %-8d \n",i,A[i]);
	}

	public static int getFirstDigit(int num){
		  while(num>9)
		  	num=num/10;
		  return num;
	}

	public static void replaceWithFirstDigit(int A[]){
		for(int i=0;i<A.length;i++){
			A[i]=getFirstDigit(A[i]);
		}
	} 

	public static void main(String[] args) {
		int size;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size Of An Array");
		size=scanner.nextInt();

		int arr[]=new int[size];

		init_Array(arr);


		displayArray(arr);

		System.out.println("--------------------");

		replaceWithFirstDigit(arr);

		displayArray(arr);
	}
	
}