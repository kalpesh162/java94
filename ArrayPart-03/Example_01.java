/* 
Array Case 8: Shift Last Element to First
WAP to shift last element to first from array.
 Example Input:
input: {10,20,30,40,50}
Output:{50,10,20,30,40}
*/

public  class Example_01 {

    public static void shiftLastToFirst(int A[]){
            // first last index
            int i=A.length-1;
            // copy last 
            int temp=A[i];
            for(;i>0;i--){
                 A[i]=A[i-1];
            }
            A[i]=temp;
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

        shiftLastToFirst(A);

        display(A);



    }
}