

/*Write a  Java  program to check whether a number is an strong number or not. */
import java.util.Scanner;
class Example04 {

	static int factorial(int n){
		 int res=1;
		 for(int i=1;i<=n;i++)
		 	res=res*i;
		 return res;
	}
	
	static boolean isStrong(int num){
		int sum=0;
		int temp=num;
		while(num>0){
			 int rem=num%10;
			 sum=sum+factorial(rem);
			 num=num/10;
		}
		return sum==temp;
	}

	public static void main(String[] args) {
		int num;
		System.out.println("Enter NUM");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		for(int i=1;i<=num;i++){
			if(isStrong(i))
				System.out.println(i);
		}
	}
	
}