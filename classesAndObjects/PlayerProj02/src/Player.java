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
   // this is used to differentiate local field and instance field
	Player(String fullName,String born,int age,String role){
		this.fullName=fullName;
		this.born=born;
		this.age=age;
		this.role=role;
	}

	public String getFullName(){ return fullName;}
	public String getBorn() { return  born;}
	public  int getAge(){ return age;}
	public  String getRole(){ return role;}

	public void setFullName(String fullName){ this.fullName=fullName;}
	public void setBorn(String born) { this.born=born;}
	public  void setAge(int age){ this.age=age;}
	public  void setRole(String role) { this.role=role;}

	// Business Logic
	public void showPlayer(){
		 System.out.println(fullName);
		 System.out.println(born);
		 System.out.println(age);
		 System.out.println(role);
		 System.out.println("---------------------");
	}

   





	
}