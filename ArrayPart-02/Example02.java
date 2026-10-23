import java.util.Scanner;
public class Example02 {

    public  static void inputArray(int A[]){
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<A.length;i++){
            System.out.println("Enter");
             A[i]=scanner.nextInt();
        }
    }

    public static void display(int A[]){
        for(int i=0;i<A.length;i++){
            System.out.println(i +"  "+A[i]);
        }
    }

    
    public static void changeData(int A[]){
         int sum=0;
         for(int i=0;i<A.length;i++)
            A[i]=A[i]*10;
    }

    public static void main(String[] args) {
        int size;
        System.out.println("Enter Size of An Array ");
        Scanner scanner=new Scanner(System.in);
        size=scanner.nextInt();

        // Array Craete
        int num[]=new int[size];

        inputArray(num);

        display(num);

        changeData(num);

        display(num);

    }
    
}
