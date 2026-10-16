public  class Student {
	int id;
	String name;
	double marks;

	void showStudentInfo(){
		  System.out.println(id);
		  System.out.println(name);
		  System.out.println(marks);
		  System.out.println("-------------------");
	}

   int getId(){ return id;}

   String getName(){ return name;}

   double getMarks(){ return marks;}

  void setId(int sid){
  	 id=sid;
  } 

  void setName(String sname){
  	 name=sname;
  }

  void setMarks(double smarks){
    marks=smarks;
  }
	
}