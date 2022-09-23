package com.mycompany.agency;



public class StaffEmployee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;


    public StaffEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

@Override
    public String toString()
    {
        String s = String.format("Name: %s\nAddress: %s\nPhone: %s\nSocial Security Number: %s\nPayRate: %s", name, address, phone, socialSecurityNumber, payRate);
        return s;
    }

 @Override
    public double pay()
    {
       return payRate;
    }
}
