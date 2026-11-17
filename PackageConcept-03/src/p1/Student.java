package p1;

public class Student{
	private int id;
	private String name;
	private double marks;

	public Student(){
		this(10,"Sachin",99);  // this() must be the first statement in constructor
		//System.out.println("default");

	}
	public Student(int id,String name,double marks){
		//System.out.println("parameerized");
		this.id=id; this.marks=marks; this.name=name;
		
	}

	public void setId(int id){ this.id=id;}
	public void setName(String name) {  this.name=name;}
	public void setMarks(double marks){ this.marks=marks;}

	public int getId(){ return  id;}
	public String getName() {return name; }
	public double getMarks() {  return  marks;}

	public void showStudentInfo(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
	}

}