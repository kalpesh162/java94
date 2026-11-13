class Employee{
	private int id;
	private String name;
	private double salary;

	public Employee(){ id=10 ; name=""; salary=0.0;}

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


public class Example01 {

	public static void main(String[] args) {
	
		Employee emp1=new Employee();	 //id=10 ; name=""; salary=0.0;

		Employee emp2=new Employee("Ramesh",10000);
		// id=0 name=Ramesh salary=10000


	}
	
}