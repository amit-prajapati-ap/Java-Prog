package JavaDoc;

/**
 * This is a Good Class
 */
public class Tags_Functions {
    /**
     *
     * @param a These are aruments supplied to the command line
     * @param b These are aruments supplied to the command line
     */
    public void add(int a,int b) {
        System.out.println("The Sum is : " + (a + b));
    }

    /**
     * Hello this is the method and this is the most beautiful method of this class.
     * @param a This is the first number to subtract
     * @param b This is the first number to subtract
     * @return Subtraction of two number as an integer
     * @throws Exception if a is 0
     * @deprecated This method is deprecated please use plus operator
     */
    public int sub(int a,int b) throws Exception{
        if (a == 0) {
            throw new Exception();
        }
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println("This is My Main Method");
    }
}
