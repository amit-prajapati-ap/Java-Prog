public class Finally_Example {
    public static  int greed() {
        try {
            int a = 5;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This is The End Of The Function");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(greed());
        int a = 7,b = 9;
        while(true) {
            try {
                System.out.println(a/b);
            }
            catch(Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Finally for value of b = " + b);
            }
            b--;
        }
        try {
            System.out.println(15/6.23f);
        }
        finally {
            System.out.println("Yes Finally");
        }
    }
}