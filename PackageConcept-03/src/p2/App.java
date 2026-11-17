package p2;



class App{
	public static void main(String[] args) {

		p1.Student student1=new p1.Student();
		student1.showStudentInfo();
		student1.setId(11);
		student1.setName("Kalpesh");
		student1.setMarks(78);

		student1.showStudentInfo();

		//System.out.println(student1.id);
		// fully classified Name
		p1.Student s2=new p1.Student(101,"Rajesh",56);
		s2.showStudentInfo();
		
	}
}