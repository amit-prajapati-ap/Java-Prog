package folder1.folder2.folder3;
class scals {
    public void sin(int num1,int num2) {
        System.out.println("Scintific Calculator : " + Math.sin(num1+num2));
    }
}
public class sccalculator {
    public static void main(String []args) {
        scals c = new scals();
        c.sin(5,7);
    }
}