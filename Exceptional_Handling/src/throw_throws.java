class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius Cannot be Negative";
    }

    @Override
    public String getMessage() {
        return "Radius Cannot be Negative";
    }
}
public class throw_throws {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        // Made by Amit
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam - uses divide function created by Amit
        try {
            int c = divide(5, 0);
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        try {
            double area = area(5);
            System.out.println(area);
        }
        catch (Exception e) {
            System.out.println("Negative Area Exception Occured");
        }
    }
}
