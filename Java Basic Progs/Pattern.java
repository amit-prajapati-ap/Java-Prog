
import java.util.Scanner;
public class Pattern {
    public static void pattern_printing(int n) {
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < i+1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i = n-1 ; i >= 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern_printing_recursion(int n) {
        if(n == 1) {
            System.out.print(" * ");
            return;
        }
        for(int i = 0 ; i < n ; i++) {
            System.out.print(" * ");
        }
        System.out.println();
        pattern_printing_recursion(n-1);
    }
    static void pattern_printing_recursion2(int n) {
        if(n > 0){
        pattern_printing_recursion2(n-1);
        for(int i = 0 ; i < n ; i++) {
            System.out.print(" * ");
        }
        System.out.println();
        }
    }
    static float avg(int ...arr) {
        int sum = 0;
        int n = arr.length;
        for(int  i = 0 ; i < n ; i++) {
            sum += arr[i];
        }
        return (float)sum / n;
    }
    public static void main(String[] args) {
//        System.out.print("Enter The Number : ");
//        Scanner s = new Scanner(System.in);
//        byte n = s.nextByte();
//        for (int i = 0 ; i < n ; i++) {
//            for(int j = i ; j < n ; j++) {
//                System.out.print('*');
//            }
//            if(i != n-1) {
//            System.out.println();
//            }
//        }
//        int []arr = new int[5];
//        arr[0] = 1;
//        arr[2] = 5;
//        arr[3] = 10;
//        arr[4] = 7;
//        arr[1] = 6;
        pattern_printing_recursion2(5);
//        System.out.println(avg(88,95,93,79,83));
    }
}
