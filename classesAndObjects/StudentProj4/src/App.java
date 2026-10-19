public class App {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(11);
		s1.setName("Rahul");
		s1.setMarks(77.77);

		s1.showDetails();

		char grade=s1.showStudentGrade();

		System.out.println(grade);
	}
	
}