import java.util.Scanner;
import java.util.Random;
public class ExampleNo21 {

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

	static int countDigit(int num){
		 int cnt=0;
		 while(num>0){
		  	num=num/10;
		  	cnt++;
		  }
		  return cnt;
	}

	static int getMultiplier(int num){
			int cnt=countDigit(num);
			int multiplier=1;
			while (cnt>1) {
				multiplier=multiplier*10;
				cnt--;
			}
			return multiplier;
	}

	public static void shiftLastDigitToFirst (int A[]){
		for(int i=0;i<A.length;i++){
			A[i]=(A[i]%10)*getMultiplier(A[i])+(A[i]/10);
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

		shiftLastDigitToFirst(arr);

		displayArray(arr);
	}
	
}