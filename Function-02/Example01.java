import java.util.Scanner;
class Example01 {
	static int reverse(int num){
		int sum=0;
		while (num>0) {
				sum=sum*10+num%10;
				num=num/10;
		}
		//System.out.println("reverse "+sum);
		return sum;
	}
	static void factors(int num){
			System.out.println("---------------");
		  for(int i=1;i<num;i++){
		  	 if(num%i==0)
		  	 	System.out.print(i +" ");
		  }
		  System.out.println();
	}
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter N ..");
			int num=scanner.nextInt();

			int rev=reverse(num);

			System.out.println("reverse "+rev);
			factors(rev);

			factors(num);

	}
	
}