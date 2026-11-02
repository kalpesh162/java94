// 11 22 +
public class Example03 {

	public static void main(String[] args) {

		if(args.length >3 || args.length<3){
			System.out.printf("BAD :: Command ");
			System.exit(1);
		}

		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int res=0;
       	//args[2]  // +  args[2].equals("+")
       	if(args[2].equals("+"))
       	 res=n1+n2;		
       else if(args[2].equals("-"))
       	 res=n1-n2;		
       else if(args[2].equals("/"))
       	 res=n1/n2;		
       else{
       	System.out.println("Wrong :: Operator   ");
       	System.exit(1);
       }

       System.out.println("res  :  "+res);

	}
}

