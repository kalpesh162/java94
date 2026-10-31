class  Bird{
	static int cnt=0;

	Bird(){
		 cnt++;
	}

}


public  class App02 {

	public static void main(String[] args) {
	
		Bird b1=new Bird();
		Bird b2=new Bird();
				System.out.println(b1.cnt);  
				System.out.println(b2.cnt);  
		Bird b3=new Bird();
		Bird b4=new Bird();

		System.out.println(b4.cnt);  // 4

	}
	
}