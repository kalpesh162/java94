public  class Date {
	int dd;
	int mm;
	int yy;

	//constructor
	Date(){
		dd=1;
		mm=1;
		yy=1970;	 
	}

	Date(int ldd,int lmm,int lyy){
		 dd=ldd;  mm=lmm; yy=lyy; 
	}

	void setDD(int ldd){
		 dd=ldd;
	}
	void setMM(int lmm){
		 mm=lmm;
	}
	void setYY(int lyy){
		 yy=lyy;
	}
	int getDD(){ return dd;}
	int getMM(){ return mm;}
	int getYY(){ return yy;}

	void showDate(){
		System.out.println(dd+"/"+ mm +"/"+yy);
	}


}