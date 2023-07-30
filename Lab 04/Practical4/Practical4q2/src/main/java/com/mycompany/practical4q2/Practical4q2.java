
package com.mycompany.practical4q2;

public class Practical4q2 {

    public static void main(String[] args) 
    {
        SupperB b = new SupperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() );  
    }
}
