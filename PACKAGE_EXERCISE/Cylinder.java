package com.Amit.Shape;
public class Cylinder extends Shape{
    Cylinder(int dim1,int dim2) {
        super(dim1,dim2);
    }
    public double area() {
        double val1 = 2 * Math.PI * dim1 * dim2;
        double val2 = 2 * Math.PI * dim1 * dim1;
        double Area = val1 + val2;
        return Area;
    }
}
