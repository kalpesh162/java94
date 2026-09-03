
class Example01 {
	 public static void main(String[] args) {
	 	
	 	int num=12999;
	 	int a=(num%10+1)%10;
	 	num=num/10;
	 	int b=(num%10+1)%10;
	 	num=num/10;
	 	int c=(num%10+1)%10;
	 	num=num/10;
	 	int d=(num%10+1)%10;
	 	num=num/10;
	 	int e=(num%10+1)%10;
	 	
	 	System.out.println("a "+a);
	 	System.out.println("b "+b);
	 	System.out.println("c "+c);
	 	System.out.println("d "+d);
	 	System.out.println("e "+e);

	 	int result=e*10000+d*1000+c*100+b*10+a*1;

	 	System.out.println(result);
	 }
	
}