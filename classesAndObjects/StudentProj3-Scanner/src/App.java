import java.util.Scanner;
public class App{
	 public static void main(String[] args) {
		 
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter Student ID");
		 int id=scanner.nextInt();
		 System.out.println("Enter Student Name");
		 String name=scanner.next();
		 System.out.println("Enter Student Marks");
		 double marks=scanner.nextDouble();

		 Student s1=new Student();
		 s1.setId(id);
		 s1.setName(name);
		 s1.setMarks(marks);

		 System.out.printf("%-4d %-10s %-4.2f",s1.id,s1.name,s1.marks);
        System.out.println();

		System.out.printf("%-4d %-10s %-4.2f",s1.getId(),s1.getName(),s1.getMarks());

	 }
}