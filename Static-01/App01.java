class  Bird{
	int cnt=0;

	Bird(){
		 cnt++;
	}

}


public  class App01 {

	public static void main(String[] args) {
	
		Bird b1=new Bird();
		Bird b2=new Bird();
		Bird b3=new Bird();
		Bird b4=new Bird();

		System.out.println(b4.cnt);

	}
	
}