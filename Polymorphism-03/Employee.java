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
