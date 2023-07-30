
package com.mycompany.practical5ex4;

public class Rectangle extends Shape
{
    private double width, height;
    
    public Rectangle(double width, double height)
    {
        this.width=width;
        this.height=height;
    }
    
   /* public void setWidth(double width)
    {
        this.width=width;
    }
    public double getWidth()
    {
        return width;
    }
    
    public void setHeight(double height)
    {
        this.height=height;
    }
    public double getHeight()
    {
        return height;
    }*/
    
    double calculateArea()
    {
        return width * height;
    }
}