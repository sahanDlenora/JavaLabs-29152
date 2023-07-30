package com.mycompany.main6;
public abstract class Shape {
    public abstract double calculateArea();
    public void display(){
        
    }
}
class Circle extends Shape{
    protected double r;
    protected static final double pi =3.14;
    
    public Circle(double r){
        this.r = r;
    }
    @Override
    public double calculateArea() {
        return pi*r*r;
    }
     public void displayRadius() {
        System.out.println("Circle radius: " + r);
    }
    
}
class Rectangle extends Shape {
	protected double w, h;
	public Rectangle(double w,double h)
        { 
            this.w = w;
            this.h = h;
        }
        
    @Override
    public double calculateArea() {
        return w * h;
    }
    public void displayDimensions() {
        System.out.println("Rectangle dimensions: " + h + " x " + w);
    }
}


