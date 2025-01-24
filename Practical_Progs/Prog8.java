// Try block with Multiple catch Block
public class Prog8 {
    public static void main(String[] args) {
        try {
            String s = null;
            int n = s.length();
            int a = 0;
            int b = 50;
            int c = a / b;
        }
        catch (ArithmeticException a) {
            System.out.println(a);
        }
        catch (NullPointerException n) {
            System.out.println("Null Pointer Exception Occured");
        }
    }
}
