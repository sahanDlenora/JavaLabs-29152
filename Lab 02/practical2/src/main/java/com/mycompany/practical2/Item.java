
package com.mycompany.practical2;

public class Item 
{
    private int location;
    private String description;
    
    public void setValues(int l, String d)
    {
        location=l;
        description=d;
    }
    
    
    public void setlocation(int location)
    {
        this.location=location;
    }
    public int getlocation()
    {
        return location;
    }
    
    public void setdescription(String description)
    {
        this.description=description;
    }
    
    public void display1()
    {
        System.out.println("Location1: "+location);
        System.out.println("Description1: "+description);
}
}

