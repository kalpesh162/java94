import java.util.Random;
class Employee{
	// class Area // Single Space 
	private static int nextId;
	private static Random random=new Random();

	//  instanace Fields
	private int id;
	private String name;
	private double salary;


	// static Block  
	{
		nextId=random.nextInt(1000);
	}

	// Instance Block
	{
		id=nextId;
	}

	public Employee(){  name=""; salary=0.0;}

	public Employee(String name,double salary){
		
		this.name=name;
		this.salary=salary;
	}

	public int getId(){ return this.id;}
	public String getName() {  return this.name;}
	public double getSalary(){ return this.salary;}

	public void setName(String name){ this.name=name;}
	public void setSalary(double salary) { this.salary=salary ;}

	public void printEmployee(){
		System.out.printf("%-4d  %-10s  %-8.2f  \n",id,name,salary);
	}

	//businnes Logic
	public double getAnnualSalary(){
		 return this.salary*12;
	}

}


public class Example04 {

	public static void main(String[] args) {
	
		Employee emp1=new Employee();	 //id=1 ; name=""; salary=0.0;
		emp1.setName("Kalpesh");
		emp1.setSalary(15000);

		Employee emp2=new Employee("Ramesh",10000);
		// id=2 name=Ramesh salary=10000

		emp1.printEmployee();
		System.out.println("--------------------------");
		emp2.printEmployee();
		System.out.println(emp1.getId());
		System.out.println(emp2.getId());

	}
	
}