package folder1.folder2.folder3;
class hcals {
    public void hyb(int num1,int num2) {
        System.out.println("Hybrid Calculator sin : " + Math.sin(num1+num2));
        System.out.println("Hybrid Calculator add : " + (num1+num2));
    }
}
public class hybridcalculator {
    public static void main(String []args) {
        hcals c = new hcals();
        c.hyb(5,7);
    }
}