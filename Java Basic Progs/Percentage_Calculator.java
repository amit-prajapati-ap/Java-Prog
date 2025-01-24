import java.util.Scanner;
public class Percentage_Calculator {
    public static void main(String[] args) {
        System.out.println("WELCOME TO PERCENTAGE CALCULATOR......");
        System.out.println();
        System.out.println("Enter Your Marks Of 5 Subjects : ");
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.print("Subject 1 : ");
        byte m1 = s.nextByte();
        System.out.print("Subject 2 : ");
        byte m2 = s.nextByte();
        System.out.print("Subject 3 : ");
        byte m3 = s.nextByte();
        System.out.print("Subject 4 : ");
        byte m4 = s.nextByte();
        System.out.print("Subject 5 : ");
        byte m5 = s.nextByte();
        int sum = m1 + m2 + m3 + m4 + m5;
        float cgpa = (float) sum / 50;
        System.out.println();
        System.out.print("Your CGPA is : ");
        System.out.println(cgpa);
    }
}
