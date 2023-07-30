

package com.mycompany.practical04q1;

public class Practical04q1 {

    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        e1.setEmpID(1234);
        e1.setEmpName("Mr.Bogdan " );
        e1.setEmpDesignation("CEO");
        
        Employee e2 = new Employee();
        e2.setEmpID(1235);
        e2.setEmpName("Ms.Bird" );
        e2.setEmpDesignation("HR-Manager");
        
        System.out.println("Employee 1 :");
        System.out.println("ID : "+e1.getEmpID());
        System.out.println("Employee Name : "+e1.getEmpName());
        System.out.println("Employee Designation : "+e1.getEmpDesignation());
        
        System.out.println("\nEmployee 2 :");
        System.out.println("ID : "+e2.getEmpID());
        System.out.println("Employee Name : "+e2.getEmpName());
        System.out.println("Employee Designation : "+e2.getEmpDesignation());
    }
}
