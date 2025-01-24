// Example code for Exception Handling
public class Prog7 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 50;
            int c = b / a;
            System.out.println("Inside Try Block");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("After Catch Block");
    }
}