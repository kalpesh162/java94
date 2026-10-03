
/*Write a Java program to check whether a given year is a leap year or not.*/

import java.util.Scanner;

class Example02{
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENter Year : " );
        year=scanner.nextInt();
        //year%100!=0  &&  year%4==0 || year%400==0 
        // USER INPUT

        if(year<=0){
        	System.out.println("Inout Should have + Value");
        	System.exit(1);
        }

        if(year%100!=0  &&  year%4==0){
             System.out.println("Leap Year");
        }
        else if(year%400==0){
        	     System.out.println("Leap Year");
        }
        else{
            System.out.println("NOT Leap Year");
        }
        
    }
}

