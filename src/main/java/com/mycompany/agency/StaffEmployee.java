package com.mycompany.agency;




public class StaffEmployee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  TODO 2: Sets up this staff employee with the specified
    //  information. @todo Nur
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }


    public String toString()
    {
        String s = String.format("Name: %s\nAddress: %s\nPhone: %s\nSocial Security Number: %s\nPayRate: %s", name, address, phone, socialSecurityNumber, payRate);
        return s;
    }


    public double pay()
    {
       return payRate;
    }
}
