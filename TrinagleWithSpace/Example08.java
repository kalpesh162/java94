import java.util.Scanner;
/*
*****
 ****
  ***
   **
    *
*/
class Example08{
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N ");
        n=scanner.nextInt();

        for(int i=n;i>=1;i--){

            for(int sp=i;sp<n;sp++) 
                System.out.print(" ");

            for(int j=1;j<=i;j++)   
                System.out.print("*");

            System.out.println();   
        }
    }
}