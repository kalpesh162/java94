class Tree{
	int i;
	// Why
	Tree(){
		System.out.println("Constructor Called");
		i=10;
	}

	Tree(int x){
		System.out.println("Parametrized Constructor Called");
		 i=x;
	}
}

class App2 {

	public static void main(String[] args) {
			Tree t1=new Tree();
			System.out.println(t1.i);
			Tree t2=new Tree(22);
			System.out.println(t2.i);
	}
	
}