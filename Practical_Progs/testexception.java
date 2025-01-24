// Custome Exception Class
import java.util.Scanner;

class UserException extends Exception {}
public class testexception {
    static void check(int n)throws UserException {
        if(n < 18) {
            throw new UserException();
        }
        else {
            System.out.println("Eligible for voting");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Person : ");
        int n = sc.nextInt();
        try {
            check(n);
        } catch (UserException e) {
            System.out.println("Not Eligible for Voting");
        }
        finally {
            System.out.println("Executed");
        }
    }
}
