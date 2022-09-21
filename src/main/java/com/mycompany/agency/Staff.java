package com.mycompany.agency;

public class Staff {

    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        StaffEmployee se1 = new StaffEmployee("Moaath Alrajab", "202 4th street", "6318482200", "502-555-5555", 50);
        StaffEmployee se2 = new StaffEmployee("Rinku Sarkar", "50 20th street", "6318485588", "502-222-2222", 59);
        StaffEmployee se3 = new StaffEmployee("Tifanny chan", "55 1st street", "6312025544", "502-333-3333", 40);
        StaffEmployee se4 = new StaffEmployee("JOhn doe", "11 20th street", "6318464588", "502-222-2222", 54);
        StaffEmployee se5 = new StaffEmployee("The Rock", "19 25th street", "6315555588", "502-444-4444", 51);
        StaffEmployee se6 = new StaffEmployee("Kevin Hart", "80 10th street", "6318489999", "502-888-8888", 56);
        
            staffList[0] = se1;
      
        ((Executive) staffList[0]).awardBonus(500.00);

        ((TempEmploee) staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }

            System.out.println("-----------------------------------");
        }
    }
}
