import java.util.Scanner;
/*
    5
   45
  345
 2345
12345
*/
class Example07{
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N ");
        n=scanner.nextInt();

        for(int i=n;i>=1;i--){

            for(int sp=1;sp<i;sp++) 
                System.out.print(" ");

            for(int j=i;j<=n;j++)   
                System.out.print(j);

            System.out.println();   
        }
    }
}