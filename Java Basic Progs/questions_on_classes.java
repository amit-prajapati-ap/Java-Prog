
class Employee {
    int salary;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }
    public void SetName(String str) {
        name = str;
    }
    public String getName() {
        return name;
    }
}
public class questions_on_classes {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary = 200000;
        e.SetName("Amit");
        System.out.println(e.getSalary());
        System.out.println(e.getName());
    }
}
