import java.util.Scanner;
public class Nested_Try_Catch {
    public static void main(String[] args) {
        int []marks = {35,25,55};
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.print("Enter The Index : ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome To Level 1");
                try {
                    System.out.println("Welcome To Level 2");
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException a) {
                    System.out.println("Sorry This Index Does Not Exist");
                    System.out.println("Exception in Level 2");
                }
            }
            catch (Exception e) {
                System.out.println("Exception in Level 1");
            }
        }
        System.out.println("Thank You !!!");
    }
}
