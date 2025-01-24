// This Is The Programme That Show How To Make Custome Exception
import java.util.Scanner;
//class Myexception extends Exception {
//    @Override
//    public String toString() {
//        return super.toString() + " I Am toString()";
//    }
//    public String getMessage() {
//        return super.getMessage() + " I Am getMessage()";
//    }
//}
class Myexception extends Exception {
    @Override
    public String toString() {
        return "I Am toString()";
    }
    public String getMessage() {
        return "I Am getMessage()";
    }
}
class MaxAge extends Exception {
    @Override
    public String toString() {
        return "Age Cannot Be Greater Than 125Years";
    }
    public String getMessage() {
        return "Age Should Be Correct";
    }
}
public class Exception_Class {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter The Number : ");
//        int a = s.nextInt();
//        if (a < 99) {
//            try {
////                throw new Myexception();
//                throw new ArithmeticException("This Is My Exception");
//            }
//            catch (Exception e) {
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                System.out.println(e);
//                e.printStackTrace();
//                System.out.println("Finished");
//            }
//        }
        System.out.print("Enter The Age : ");
        int a = s.nextInt();
        if (a > 125) {
            try {
//                throw new Myexception();
                throw new MaxAge();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
        System.out.println("Thank You!!!");
    }
}
