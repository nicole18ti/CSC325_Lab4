package com.mycompany.agency;

// TODO 1: Make Intern a child of StaffEmploee, change it to StaffMember - done
public class Intern extends StaffMember {

    //-----------------------------------------------------------------
    //  TODO 2: Constructor: Sets up this intern using the specified
    //  information.
    //-----------------------------------------------------------------
    
    // Variables for StaffMember
    private String eName;
    private String eAddress;
    private String ePhone;

    public Intern(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
        this.eName = eName;
        this.eAddress = eAddress;
        this.ePhone = ePhone;
    }

    
    public void setePhone(String ePhone) {
        this.ePhone = ePhone;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public String getePhone() {
        return ePhone;
    }

    //-----------------------------------------------------------------
    // TODO 3:  Returns a zero pay value for this intern.
    //-----------------------------------------------------------------
    @Override
    public double pay() {
        return 0;
    }
}
