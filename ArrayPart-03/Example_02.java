/* 
 Array Case 10: Swap First and Last Element (Without Third Variable)
 Write a program to swap the first element and the last element of an array without using a third (temporary) variable.
 Example Input:
Array = [7, 14, 21, 28, 35]
 Expected Output:
Before Swap: [7, 14, 21, 28, 35]
After Swap:  [35, 14, 21, 28, 7]
 
*/

public  class Example_02 {

    public static void swapFirstAndLast(int A[]){
           if(A==null) return ;

           if(A.length==1) return ;
           
           A[0]=A[0]+A[A.length-1];
           A[A.length-1]=A[0]-A[A.length-1];
           A[0]=A[0]-A[A.length-1];
    }

    public static  void display(int A[]){
        /* 
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
       */
      //for each 

      for(int ele:A)
        System.out.print(ele+"  ");

      System.out.println();

    }

    public static void main(String[] args) {
        
        int A[]={11,22,33,44,55};

        display(A);

        swapFirstAndLast(A);

        display(A);



    }
}