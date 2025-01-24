import java.sql.Array;
import java.util.Scanner;
// Handling Specific Exception
public class Specific_Exceptions {
    public static void main(String[] args) {
        int []arr = {7,56,6};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Array Index Which We Divide : ");
        int index = s.nextInt();
        System.out.println("Enter The Number Which You Divide : ");
        int number = s.nextInt();
        try {
            System.out.println("The Value at Array Index Entered Is : " + arr[index]);
            System.out.println("The Value Of Array Value/Number Is : " + arr[index]/number);
        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception ex) {
            System.out.println("Some Other Exception");
        }
        System.out.println("Programme End!!!");
    }
}
