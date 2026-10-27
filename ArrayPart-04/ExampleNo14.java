/*
Array Case 14: Maximum Element
Write a program to find the maximum element in an array.
Example Input:
Array = [12, 45, 67, 23, 89, 34]
Expected Output:
Maximum Element = 89
*/
import  java.util.Scanner;
import java.util.Random;

public class ExampleNo14{

    public  static void init_Array(int A[]){
        Random random=new Random();
        for(int i=0;i<A.length;i++)
        A[i]=random.nextInt(200000);

    } 

    public static void display(int A[]){
           for(int ele:A)
            System.out.println(ele);
    }

    public static int maxElementArray(int A[]){
         if(A==null) {
             System.err.println("Invalid Array ");
             System.exit(1);
         }
         if(A.length==1) return A[0];
         int max=Integer.MIN_VALUE;

         for(int i=0;i<A.length;i++)
            if(A[i]>max){
                max=A[i];
            }
            return max;
    }


    public static void main(String a[]){
        int size;
        System.out.println("Enter Size");
        Scanner scanner=new Scanner(System.in);
        size=scanner.nextInt();
        
        int A[]=new int[size];

        init_Array(A);  // intialize

        System.out.println("Display ");
        display(A);

        System.out.println("MAx Element   "+maxElementArray(A));
        



    }
}