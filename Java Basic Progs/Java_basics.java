import java.util.Scanner;
public class Java_basics
{
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Value Of a : ");
        int a = s.nextInt();
        System.out.println("Enter Value Of b : ");
        byte b = s.nextByte();
        System.out.println(a + " , " + b);
        System.out.println("Enter a String : ");
        String str = s.next();
        System.out.println(str);
        System.out.println("Enter an integer : ");
        boolean bo = s.hasNextInt();
        System.out.println(bo);
    }
}
