package p1;
public class Employee extends Person{
		private double salary;

		public Employee(String name,int age,double salary){
			super(name,age);
			this.salary=salary;
		}

		public Employee(String name,int age){
			super(name,age);
		}

		public void setSalary(double salary){this.salary=salary;}
		public double getSalary(){ return salary;}

		public void displayEmployee(){
			// super.name  name-->private 
			// super.age
			 //System.out.prinf("%-10s %-5d %10.2f ",super.getName(),super.getAge(),salary);
			super.displayPerson();
			System.out.println(salary);
		}
}