package JavaDoc;
/**
   * This class is a demonstration what javadoc is and how it is used in the java industry.
   * This is <i>italic word</i> <p>This is paragraph</p>
   * @author Amit
   * @version 0.1
   * @since 2005
   * @see <a href = "https://docs.oracle.com/en/java/javase/14/"   target = "_blank" >Java Docs </a>
*/

public class Tags_Classes {
    public void add(int a,int b) {
        System.out.println("The Sum is : " + (a + b));
    }
    public static void main(String[] args) {
        System.out.println("This is My Main Method");
    }
}
