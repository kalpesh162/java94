package p2;

import static p1.Student.institute;
import static  p1.Student.getInstituteName;

// What is difference between import and static import

import static java.lang.Math.PI;
import static  java.lang.System.out;
import static java.util.Arrays.sort;
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

		System.out.println(p1.Student.institute);
		System.out.println(p1.Student.getInstituteName());
		System.out.println("-----------------------");
		System.out.println(institute);
		System.out.println(getInstituteName());

		System.out.println("-----------------------");

		//System.out.println(Math.PI);
		System.out.println(PI);

		out.println("Hello");

		int arr[]={33,22,11,44,55};

		sort(arr);

		for(int ele : arr)
			System.out.print(ele +  "  ");
	}
}