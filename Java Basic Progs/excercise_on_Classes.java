class cylinder2{
    private Byte radius;
    private Byte height;
    private double A;
    public void  setter(Byte radius,Byte height) {
        this.radius = radius;
        this.height = height;
    }
    public void getter() {
        System.out.println("Radius : " + radius);
        System.out.println("Height : " + height);
    }
    public double Area() {
        A = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
        return A;
    }
}
