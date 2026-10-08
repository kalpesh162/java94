/*
🔢 Problem 9: Append Two Numbers
📜 Task: Append one number to another.
int a = 123;
int b = 234;

Result:
123234
*/
import java.util.Scanner;
class Example14 {

	public static void main(String[] args) {
		int a,b;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num1  ");
		a=scanner.nextInt();
		System.out.println("Enter Num2  ");
		b=scanner.nextInt();
		int temp=b;
		boolean flag=true;

		if(a<0){
			 a=a*-1;
			 flag=false;
		}
		else if(b<0){
			 b=b*-1;
			 flag=false;
		}


		int multiplier=1;
		while(temp>0){
			 temp=temp/10;
			 multiplier=multiplier*10;
		}

		int res=a*multiplier+b;

		System.out.println(a);
		System.out.println(b);
		
	
		// validation for sign
		if(a>0 && b>0 && flag){
			System.out.println(res);
		}
		else if(flag==false){
			res=res*-1;
			System.out.println(res);
		}

		}	
	}