/*
Array Case 16: Find Pair with Given Sum
Write a program to find all pairs of two elements in an array whose sum is equal to a given number.
Example Input:
Array = [4, 8, 12, 16]
Target Sum = 20
Expected Output:
Pairs with sum 20:
(4, 16)
(8, 12)

*/
import  java.util.Scanner;
import java.util.Random;
public  class ExampleNo16 {

    
    public  static void init_Array(int A[]){
        Random random=new Random();
        for(int i=0;i<A.length;i++)
        A[i]=random.nextInt(100);

    } 

    public static void display(int A[]){
           for(int ele:A)
            System.out.println(ele);
    }

    public static void printSumOfPairs(int A[],int sum){

        for(int i=0;i<A.length-1;i++){
               int x=A[i];
               for(int j=i+1;j<A.length;j++){
                  if(x+A[j]==sum)
                    System.out.println(x+"  "+A[j]);
               }
        }

    }


    public static void main(String[] args) {
          int size; int sum;
        System.out.println("Enter Size");
        Scanner scanner=new Scanner(System.in);
        size=scanner.nextInt();
        
        int A[]=new int[size];

        init_Array(A);  // intialize

        System.out.println("Enter Size");
        sum=scanner.nextInt();

        System.out.println("Display ");
        display(A);

          printSumOfPairs(A,sum);  


    }
    
}