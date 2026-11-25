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
	static  
	{
		nextId=random.nextInt(1000);
	}

	// Instance Block
	{
		id=nextId;
		nextId++;
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
class Manager extends Employee{
	private double bonus;

	public Manager(String name,double salary){
		 super(name,salary);
	}

	public void setBonus(double bonus){
			this.bonus=bonus;
	}
	public double getBonus(){
		return bonus;
	}
	@Override
	public double getSalary(){
	 return super.getSalary()+bonus;
	}
	
}


class App  {

	public static void main(String[] args) {
		
		Employee emp=new Employee("Arjun",15000);

		emp.printEmployee();

		Manager  m1= new Manager("Yogesh",45000);
		System.out.println(m1.getSalary());
		m1.printEmployee();
		m1.setBonus(50000);
		System.out.println();
		System.out.println(m1.getSalary());



	}
	
}