package com.Amit.Shape;
public class Sphere extends Shape{
    Sphere(int dim1) {
        super(dim1,-1);
    }
    public double area() {
        return 4 * Math.PI * this.dim1 * this.dim1;
    }
    public double volume() {
        return 4/3 * Math.PI * this.dim1 * this.dim1;
    }
}
