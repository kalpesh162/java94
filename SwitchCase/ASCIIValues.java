class ASCIIValues {

	public static void main(String[] args) {
		
		for(int i=0;i<=255;i++){

			  System.out.printf("%-3d    %-3c ",i,(char)i);
			  if(i%8==0)
			  	System.out.println();
		}
	}
	
}