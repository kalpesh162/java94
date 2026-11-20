package p2;
import p1.Person;
import p1.Employee;


public class App {

	public static void main(String[] args) {
		
		Person p1=new Person("Ajay",22);
		Employee emp1=new Employee("Ramesh",33,454545);

		p1.displayPerson();

		emp1.displayEmployee();

	}
	
}