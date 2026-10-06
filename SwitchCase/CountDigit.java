import java.util.Scanner;

class CountDigit {
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		num=scanner.nextInt();
		int temp=num;
		
	
		int cnt=0;
		while(num>0){
			 num=num/10;
			 cnt++;
		}
		System.out.println(cnt);	

		System.out.printf("NUM  :  %d  DIGITS :  %d",temp,cnt);
		
	}
	
}