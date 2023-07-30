package com.mycompany.main6;
public class Main6 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.displayRadius();
        System.out.println("Circle area: " + c1.calculateArea());

        Rectangle r1 = new Rectangle(4, 6);
        r1.displayDimensions();
        System.out.println("Rectangle area: " + r1.calculateArea());
    }
}
