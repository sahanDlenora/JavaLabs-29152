
package com.mycompany.practical05q2;

public class Circle implements Shape
{
    private double radius;
    
    
    public Circle(double radius)
    {
        this.radius=radius;
    }
    
   
    public void setRadius(double r)
    {
        radius=r;
    }
    public double getRadius()
    {
        return radius;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double CalculateArea()
    {
        return (Math.PI * radius * radius);
    }
    @Override
    public double CalculatePerimeter()
    {
        return (Math.PI * 2 * radius);
    }
}
