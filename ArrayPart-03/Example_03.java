/* 
Array Case 11: Shift First to Last (Without Third Variable)
 
Write a program to move the first element of the array to the last position (shift left by one) without using a third variable.
 
Example Input:
Array = [1, 2, 3, 4, 5]
 
Expected Output:
Before Shift: [1, 2, 3, 4, 5]
After Shift:  [2, 3, 4, 5, 1]

*/

public  class Example_03 {

    public static void swapFirstAndLast(int A[]){
            if(A==null) return ;
            if(A.length==1) return ;
         for(int i=0 ;i <A.length-1;i++){
            A[i]=A[i]+A[i+1];
            A[i+1]=A[i]-A[i+1];
            A[i]=A[i]-A[i+1];
         }
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