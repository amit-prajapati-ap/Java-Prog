package folder1.folder2.folder3;
class cals {
    public void add(int num1,int num2) {
        System.out.println("Simple Calculator : " + (num1+num2));
    }
}
public class simplecalculator {
    public static void main(String []args) {
        cals c = new cals();
        c.add(5,7);
    }
}