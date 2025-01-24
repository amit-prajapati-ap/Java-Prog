/*blic class demo {
  static int sum(int ...arr) {
        int result=0;
for (int a:arr){
result+=a;
}
return result;
}
public static void main(String[] args){
    System.out.println("Tha sum of 4 and 5 is:" +sum(arr.4,5)')';
    System.out.println("Tha sum of3,4 and 5 is:"+sum(..arr.3,4,5));*/
   /* public class Demo{
        static int sum(int... arr) { // Corrected syntax for varargs
            int result = 0;
            for (int a : arr) {
                result += a;
            }
            return result;
        }
        public static void main(String[] args) {
            Demo obj = new Demo();
            System.out.println("The sum of 4 and 5 is: " +obj.sum(5,6));
            System.out.println("The sum of 3, 4 and 5 is: " + obj.sum(3, 4, 5));*/
class Example {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
    public static void main(String[] args) {
        // System.out.println(args[0] + " " + args[1]);

        /*int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x + y;
        System.out.println("sum = " + z);*/

        multiplication(7);
    }
}