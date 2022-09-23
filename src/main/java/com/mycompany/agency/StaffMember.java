package com.mycompany.agency;



// TODO 1: Make this class work and public
   public class StaffMember
{
    protected String name;
    protected String address;
    protected String phone;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff member using the specified
    //  information.
    //-----------------------------------------------------------------

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    //-----------------------------------------------------------------
    //  Derived classes must define the pay method for each type of
    //  employee.
    //-----------------------------------------------------------------

    public abstract double pay(); 
    
    //-----------------------------------------------------------------
    // TODO 2: Returns a string including the basic employee information.
    //-----------------------------------------------------------------
 
    @Override
    public String toString() {
        return "StaffMember{" + "name=" + name + ", address=" + address + ", phone=" + phone + '}';
    }
    
}  
