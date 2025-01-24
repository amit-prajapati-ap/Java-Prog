package JavaDoc;

@FunctionalInterface // Function interface Annotation
interface MyFunctionalInterface {
    void thisMethod();
//    void thisMethod2();
}
class Base {
    public void greet() {
        System.out.println("Base class Good Morning");
    }
}
class NewClass extends Base{
    @Override // Override Annotation
    public void greet() {
        System.out.println("NewClass Good Morning");
    }
    @Deprecated // Deprecation Annotation
    public int sum(int a,int b) {
        return a + b;
    }
}
public class Java_Annotations {
    @SuppressWarnings ("deprecation")
    public static void main(String[] args) {
        NewClass n = new NewClass();
//        n.greet();
        System.out.println("Sum is : " + n.sum(5,3));
    }
}
