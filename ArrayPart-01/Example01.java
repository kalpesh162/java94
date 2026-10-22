public class Example01 {

	public static void main(String[] args) {
		
		int inningsScore[]=new int[5];  // Array Declaration + Array Create 
		// member intialization list
		inningsScore[0]=123;
		inningsScore[1]=133;
		inningsScore[2]=143;
		inningsScore[3]=153;
		inningsScore[4]=163;


		System.out.println(inningsScore[0]);
		System.out.println(inningsScore[1]);
		System.out.println(inningsScore[2]);
		System.out.println(inningsScore[3]);
		System.out.println(inningsScore[4]);

		// create Array
		// intialize
		// print 
		// Array size arr.length
		for(int i=0;i<inningsScore.length;i++){
			System.out.println(inningsScore[i]);
		}


	}
	
}