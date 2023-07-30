
package com.mycompany.practical5ex4;

/**
 *
 * @author DAD Krishani Hansika
 */
public class Circle extends Shape
{
    private final double radius;
    
    public Circle(double radius)
    {
        this.radius=radius;
    }
    
   /* public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }*/
    
    double calculateArea()
    {
        return (double)(Math.PI * radius * radius);
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}