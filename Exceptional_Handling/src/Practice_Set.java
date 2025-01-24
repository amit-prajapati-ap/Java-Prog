import java.util.Scanner;
class Error extends Exception {
    @Override
    public String getMessage() {
        return "Maximum Retries Exceeded";
    }
    public String toString() {
        return "Maximum Retries Exceeded";
    }
}
public class Practice_Set {
    public static void main(String[] args) {
        // Problem 1
//        int a = 7 // Syntax Error
//        int year_born = 2000-78; // Logical Error
//        System.out.println(6/0); // Runtime Error

        // Problem 2
//        try {
//            int a = 666/0;
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println("HEHE");
//        }
//        catch (ArithmeticException e) {
//            System.out.println("HAHA");
//        }

        // Problem 3
        int []arr  = {30,5,20,6};
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        int index,i = 0;
        while(flag && i < 5) {
            try {
                System.out.print("Enter The Index : ");
                index = s.nextInt();
                System.out.println("The Value of Marks[index] is : " + arr[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index...");
                i++;
            }
        }
        try {
            if (i == 5) {
                throw new Error();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
