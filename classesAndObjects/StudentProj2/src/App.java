public class App{
	 public static void main(String[] args) {
	 	
	 	Student student1=new Student();
	 	// OBJECT
	 	// STATE
	 	// IDENTITY
	 	// BEHAVIOUR  -- methods
	 	student1.showStudentInfo();

	 	//System.out.println(student1.id);
	 	student1.id=11;
	 	student1.name="Kareena";
	 	student1.marks=66.66;
	 	System.out.println(student1); //Student@15db9742  IDENTITY

	 	student1.showStudentInfo();

	 	String n=student1.getName();

	 	System.out.println(n);

	 	student1.setName("Raveena");

	 }
}