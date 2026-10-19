class Tree{
	int i;
	// Why
	Tree(){
		System.out.println("===> "+i);
		i=10;
	}

	Tree(int x){
		System.out.println("---> "+i);
		 i=x;
	}
}

class App3 {

	public static void main(String[] args) {
			Tree t1=new Tree();
			
			Tree t2=new Tree(22);
			
	}
	
}