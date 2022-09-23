package com.mycompany.agency;



    // done 1: Make TempEmploee a child of StaffEmploee

public class TempEmploee extends StaffEmployee
{
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmploee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // done Adds the specified number of hours to this employee's
    //  accumulated hours.
    //-----------------------------------------------------------------
    public void addHours(int moreHours)
    {
        this.hoursWorked = hoursWorked + moreHours;
    }

    //-----------------------------------------------------------------
    // done Computes and returns the pay for this hourly employee.
    //-----------------------------------------------------------------
    @Override
    public double pay()
    {
       return super.payRate * hoursWorked;
    };

    //-----------------------------------------------------------------
    // done Returns information about this hourly employee as a string.
    //-----------------------------------------------------------------

    @Override
    public String toString() {
        return super.toString() + "hours worked: " + hoursWorked;
    }

   
    
}
