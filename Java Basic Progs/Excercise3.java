class circle {
    int radius;
    public circle(int r) {
        this.radius = r;
    }
    public double Area() {
        return (2 * Math.PI * radius * radius);
    }
}
class cylinder extends circle {
    int height;
    public cylinder(int r,int h) {
        super(r);
        this.height = h;
    }
    public double Area() {
        return (2 * Math.PI * radius * height + 2 * Math.PI * radius * radius);
    }
}
public class Excercise3 {
    public static void main(String[] args) {
        cylinder c = new cylinder(2,5);
        System.out.printf("Area Of Cylinder Is : %.2f",c.Area());
    }
}