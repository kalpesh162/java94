public class Student {

	int id;  // member field  //instance field
	String name;
	double marks;

	// member method  instance method
	void setId(int sid){
		 //sid local field
		 id=sid;
	}
	void setName(String sname){
		name=sname;
	}
	void setMarks(double smarks){
		marks=smarks;
	}

	int getId(){return id;}
	String getName(){return name;}
	double getMarks(){return marks;}

	void showDetails(){
		System.out.println(id +" "+name+" "+marks);
	}

	char showStudentGrade(){
		if(marks>=80) return 'A';
		else if(marks>=60) return 'B';
		else if(marks>=40) return 'C';
		else return 'D';
	}


	
}