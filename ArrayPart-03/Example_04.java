/* 
Array Case 13: Reverse Array (Without Third Variable)
Write a program to reverse all elements of an array without using a third variable.
Example Input:
Array = [5, 10, 15, 20, 25]
 
Expected Output:
Before Reverse: [5, 10, 15, 20, 25]
After Reverse:  [25, 20, 15, 10, 5]
*/

public  class Example_04 {
    public static void reverseArray1(int A[]){
            if(A==null) return ;
            if(A.length==1) return ;
         for(int i=0 ;i <A.length/2;i++){
             int n1=A[i];
             int n2=A[A.length-1-i];
             A[i]=n2;
             A[A.length-1-i]=n1;
         }
    }
    public static void reverseArray2(int A[]){
            if(A==null) return ;
            if(A.length==1) return ;
         int i=0;
         int j=A.length-1;
         while(i<j){
            int n1=A[i];
            int n2=A[j];
           A[i]=n2;
           A[j]=n1;
            i++;
            j--;
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

        reverseArray2(A);

        display(A);



    }
}