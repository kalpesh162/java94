import java.util.Random;
import java.util.Scanner;
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

	public Employee(){ 
        this("",0.0);  // Constructor Chaining
	}

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


public class Example06 {

	public static void inputEmployee(Employee[] emp){
		Scanner scanner=new Scanner(System.in);
		// Input All Employees

		for(int i=0;i<emp.length;i++){

			 System.out.println("Enter Name :");
			 String name=scanner.nextLine();
			 System.out.println("Enter SALARY :");
			 double salary=scanner.nextDouble();
			 emp[i]=new Employee(name,salary);
			 scanner.nextLine();
		}

	}

	public static void displayAllEmployees(Employee[] emp){

		// print All Employess using for each
		// template header
		System.out.printf("%-4s  %-10s  %-8s  \n","ID","Name","SALARY");
		System.out.println("----------------------------------------------");
		for(Employee emplyoee : emp){
			emplyoee.printEmployee();
		}
	}

  // such API
	public static Employee findEmployeeById(int id,Employee[] emp){
		for(Employee emplyoee : emp){
			   if(emplyoee.getId()==id)
			   	return emplyoee;
		}

		return  null;
	}


	public static void main(String[] args) {
		int size;
		System.out.println("Enter No Of Employees");
		Scanner scanner=new Scanner(System.in);
		size=scanner.nextInt();

		// Array Of Employees
		Employee emp[]=new Employee[size];

		inputEmployee(emp);

		displayAllEmployees(emp);

		
	}
	
}