/*
*
**
***
****
*****
*/
// C  #include<stdio.h>
// c++  using namepsace std;

import java.util.Scanner;

// C:\Program Files\Java\jdk1.8.0_241\jre\lib\rt.jar
// runtime jar   [java archive file]
// BootStrapClassPath

//C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext
// ExtensionClassPath

//E:\JAVA-WorkSpace-JAP-94\Triangle
// ApplicationClassPath

class Example01 {
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter N ");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			  for(int j=1;j<=i;j++){
			  	System.out.print("	");
			  }
			  System.out.println();
		}
		
	}
	
}