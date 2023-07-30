
package com.mycompany.practical2;

 public class Monster extends Item  
{
        

    private int location2;
    private String description2;
    
    public void setData(int location2, String description2)
    {
        this.location2=location2;
        this.description2=description2;
    }
    public void display2()
    {
        System.out.println("Location2: "+location2);
        System.out.println("Description2: "+description2);
}
}

