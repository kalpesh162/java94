public class Example03 {
    static void display(int x){
         x=x*11;
    }
    public static void main(String[] args) {
        
        int x=11;
        System.out.println("Before "+x);
        display(x);  // CALL BY VALUE
        System.out.println("After  " +x);

    }

}