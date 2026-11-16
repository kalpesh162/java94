package p2;

import p1.Student;

class App{
	public static void main(String[] args) {

		Student student1=new Student();
		student1.showStudentInfo();
		student1.setId(11);
		student1.setName("Kalpesh");
		student1.setMarks(78);

		student1.showStudentInfo();

		//System.out.println(student1.id);

		
	}
}