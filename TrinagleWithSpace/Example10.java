import java.util.Scanner;
/*
54321
 5432
  543
   54
    5
*/
class Example10{
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter N ");
        n=scanner.nextInt();

        for(int i=1;i<=n;i++){

            for(int sp=1;sp<i;sp++) 
                System.out.print(" ");

            for(int j=n;j>=i;j--)   
                System.out.print(j);

            System.out.println();   
        }
    }
}