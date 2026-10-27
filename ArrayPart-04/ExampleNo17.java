/*Array Case 17: Find Triplet with Given Sum
Write a program to find all triplets of three elements in an array whose sum is equal to a given number.
 
Example Input:
Array = [3, 6, 9, 12, 15]
Target Sum = 30
 
Expected Output:
Triplets with sum 30:
(3, 12, 15)
(6, 9, 15)
 */

import java.util.Random;
import java.util.Scanner;

public class ExampleNo17 {

      public  static void init_Array(int A[]){
        Random random=new Random();
        for(int i=0;i<A.length;i++)
        A[i]=random.nextInt(100);

    } 

    public static void display(int A[]){
           for(int ele:A)
            System.out.println(ele);
    }

    public static void printSumOfPairs1(int A[],int sum){

        for(int i=0;i<A.length-2;i++){
               int x=A[i];int y=A[i+1];
               for(int j=i+2;j<A.length;j++){
                  if(x+y+A[j]==sum)
                    System.out.println(x+"  "+y+"   "+ A[j]);
               }
        }

    }

    
    public static void printSumOfPairs2(int A[],int sum){

        for(int i=0;i<A.length-2;i++){
               
               for(int j=i+1;j<A.length-1;j++){
                    
                for(int k=j+1;k<A.length;k++){
                
                      if(A[i]+A[j]+A[k]==sum)
                        System.out.println(A[i]+"  "+A[j]+"   "+ A[k]);
                    }
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

        System.out.println("Enter SUM");
        sum=scanner.nextInt();

        System.out.println("Display ");
        display(A);

          printSumOfPairs2(A,sum);  

    }
    
}
