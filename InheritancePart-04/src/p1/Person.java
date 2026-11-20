package p1;

public class Person{
	private String name;
	private int age;

	public Person(){ 
		this("",0);
	}

	public Person(String name,int age){
		 if(name.equals("") || name!=null)
		 this.name=name;

		 if(age>=18 && age<150)
		 this.age=age;
	}

	public void setName(String name){ this.name=name;}
	public void setAge(int age){this.age=age;}

	public String getName(){ return name;}
	public int getAge(){ return age;}

	private boolean validPerson(String name,int age){
		  // validation logic
	}

   public void displayPerson(){
   	 System.out.printf("%-10s %5d \n",name,age);
   }

}