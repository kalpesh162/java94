/*Write a  Java  program to check whether a number is an Armstrong number or not. */
import java.util.Scanner;
class Example02 {
	static int power(int x,int y){
		int res=1;
		while(y>=1){
			res=res*x;
			 y--;
		}
		return res;
	}
	static int countDigit(int num){
		    int cnt=0;
		    while(num>0){
		    	 num=num/10;
		    	 cnt++;
		    }
		    return cnt;
	}
	static boolean isArmStrong(int num){
		int y=countDigit(num);
		int sum=0;
		int temp=num;
		while(num>0){
			 int x=num%10;
			 sum=sum+power(x,y);
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
			if(isArmStrong(i))
				System.out.println(i);
		}

	}
	
}