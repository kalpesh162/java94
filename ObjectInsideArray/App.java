
class Student{
	private int studentId;
    private String studentName;
    private double marks[] = new double[5];

    Student(){ }
    
    Student(int studentId , String studentName){
         this.studentId=studentId;
         this.studentName=studentName;
      }

    Student(int studentId , String studentName,double sub1,double sub2,double sub3,double sub4,double sub5){
         this.studentId=studentId;
         this.studentName=studentName;
         marks[0]=sub1;
         marks[1]=sub2;
         marks[2]=sub3;
         marks[3]=sub4;
         marks[4]=sub5;
      }

      Student(int studentId , String studentName,double marks[]){
         this.studentId=studentId;
         this.studentName=studentName;
         this.marks=marks;
      }

   int getId(){ return  studentId;}
   String getName(){ return  studentName;}
   double[] getMarks(){ return  marks;}

   void setMarks(double marks[]){
   	   for(int i=0;i<marks.length;i++){
   	   	  this.marks[i]=marks[i];
   	   }
   }

   void displayStudentInfo(){
   	  System.out.println("ID     :"+studentId );
   	  System.out.println("Name   :"+studentName );
   	  System.out.println("Marks  :  ");
   	  for(double ele:marks)
   	  	System.out.print(ele +"  ");
   }


}

public  class App {

	public static void main(String[] args) {

		Student s1=new Student(111,"Kalpesh");
		double marks[]=new double[5];
		marks[0]=44;marks[1]=55;marks[2]=66;
		marks[3]=77;marks[4]=88;

		s1.setMarks(marks);
		

		s1.displayStudentInfo();
	}
	
}