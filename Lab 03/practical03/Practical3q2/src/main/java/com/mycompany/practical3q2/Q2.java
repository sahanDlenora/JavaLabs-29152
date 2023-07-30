
package com.mycompany.practical3q2;

public class Q2 
{
    private String empName;
    private float basicSalary, bonus;
    
    
    public void setEmpName(String empName)
    {
        this.empName=empName;
    }
    public String getEmpName()
    {
        return empName;
    }
    
    public void setBasicSalary(float basicSalary)
    {
        this.basicSalary=basicSalary;
    }
    public float getBasicSalary()
    {
        return basicSalary;
    }
    
    public Q2(float bonus)
    {
        this.bonus=bonus;
    }
    public void display()
    {
        System.out.println("Bonus: "+bonus);
    }
    
    private float bonusAmount;
    public void calBonusAmount()
    {
        bonusAmount=bonus+basicSalary;
        System.out.println("Bonus Amount: "+bonusAmount);
    }
}  

