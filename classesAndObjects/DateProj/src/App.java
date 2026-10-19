public class App{
	
	public static void main(String[] args) {
		Date d1=new Date();
		d1.setDD(11);
		d1.setMM(11);
		d1.setYY(2011);

		Date d2=new Date(12,12,2012);

		d1.showDate();
		d2.showDate();
	}
}