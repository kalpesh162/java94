/*
Array Case 6: Elements Greater than Average 
Find the average of the array, and then display all elements that are greater than this average.
 
Example Input:
Array = [3, 7, 9, 2, 6]
 
Step 1: Average = (3+7+9+2+6)/5 = 27/5 = 5.4
Step 2: Elements greater than 5.4 â†’ 7, 9, 6
 
Expected Output:
Average = 5.4
Elements greater than average = 7 9 6
 
*/

import java.util.Scanner;
public class Example05 {

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
        //public static double avgOfArray(int *A){}  NOT ALLOW
    
        public static double avgOfArray(int A[]){
         int sum=0;
         for(int i=0;i<A.length;i++)
            sum=sum+A[i];

         return ((sum*1.0)/A.length);
    }

    public static void displayGreaterThanAvg(int A[]){
            double avg=avgOfArray(A);
            for(int i=0;i<A.length;i++){
                 if(A[i]>avg)
                    System.out.println(A[i]);
            }
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

        displayGreaterThanAvg(num);
        

    }
    
}
