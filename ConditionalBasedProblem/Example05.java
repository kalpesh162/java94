  /*
    Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.Scanner;
class Example05  {

    public static void main(String[] args) {
        double basicSalary;
        double grossSalary;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter BASIC SALARY");
        basicSalary=scanner.nextDouble();
         
        double hra; double da; 
        // Validation Input
         if(basicSalary<0){
            System.exit(1);
         }

        if(basicSalary>0 &&  basicSalary<=10000){
                hra=basicSalary*0.2;
                da=basicSalary*0.8;
        }
        else if(basicSalary>10000 && basicSalary<=20000){
            hra=basicSalary*0.25;
            da=basicSalary*0.9;
        }
        else{
            hra=basicSalary*0.3;
            da=basicSalary*0.95;
        }

        grossSalary=basicSalary+hra+da;

        System.out.println(grossSalary);

        String bs="BASIC SALARY ";
        String hra1="HRA ";
        String da1="DA ";
        String gross="GROSS SALARY ";
        System.out.println("***************************");
        System.out.printf("%-15s %-8.2f \n",bs,basicSalary);
        System.out.printf("%-15s %-8.2f \n",hra1,hra);
        System.out.printf("%-15s %-8.2f \n",da1,da);
        System.out.printf("%-15s %-8.2f \n",gross,grossSalary);
        System.out.println("***************************");

        System.out.println();

          System.out.println("***************************");
        System.out.printf("* %-15s %-8.2f *\n",bs,basicSalary);
        System.out.printf("* %-15s %-8.2f *\n",hra1,hra);
        System.out.printf("* %-15s %-8.2f *\n",da1,da);
        System.out.printf("* %-15s %-8.2f *\n",gross,grossSalary);
        System.out.println("***************************");

        System.out.println();
        /*
        for(int i=1;i<=8;i++){
            for(int j=1;j<=30;j++){
                  if(i==1 || j==1 || i==8 || j==30)
                    System.out.print("*");
                  else{
                            if(i==2 && j==1)
                            System.out.printf("%-15s %-8.2f \n",bs,basicSalary);
                            if(i==3 && j==1)
                            System.out.printf("%-15s %-8.2f \n",hra1,hra);
                            System.out.printf("%-15s %-8.2f \n",da1,da);
                            System.out.printf("%-15s %-8.2f \n",gross,grossSalary);
                           
   
                  }
            }
            System.out.println();
        }
      */

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 40; j++) {

                if (i == 1 || i == 8 || j == 1 || j == 40) {
                    System.out.print("*");
                } 
                else if (i == 2 && j == 3) {
                    System.out.printf("%-15s : %-10.2f", bs, basicSalary); break;
                } 
                else if (i == 3 && j == 3) {
                    System.out.printf("%-15s : %-10.2f", hra1, hra); break;
                } 
                else if (i == 4 && j == 3) {
                    System.out.printf("%-15s : %-10.2f", da1, da); break;
                } 
                else if (i == 5 && j == 3) {
                    System.out.printf("%-15s : %-10.2f", gross, grossSalary); break;
                } 
                else {
                    System.out.print(" ");
                }
            }
    System.out.println();
}

        
    }
    
}