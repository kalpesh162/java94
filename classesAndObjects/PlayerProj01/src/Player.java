public class Player {

	private String fullName;
	private String born;
	private int age;
	private String role;
	
	Player(){
		fullName="---";
		born="11-11-1111";
		age=21;
		role="";
	}

	Player(String name,String bDate,int page,String work){
		fullName=name;
		born=bDate;
		age=page;
		role=work;
	}

	public String getFullName(){ return fullName;}
	public String getBorn() { return  born;}
	public  int getAge(){ return age;}
	public  String getRole(){ return role;}

	public void setFullName(String name){ fullName=name;}
	public void setBorn(String bDate) { born=bDate;}
	public  void setAge(int page){ age=page;}
	public  void setRole(String work) { role=work;}

	// Business Logic
	public void showPlayer(){
		 System.out.println(fullName);
		 System.out.println(born);
		 System.out.println(age);
		 System.out.println(role);
		 System.out.println("---------------------");
	}

   





	
}