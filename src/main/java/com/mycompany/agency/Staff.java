package com.mycompany.agency;

public class Staff {

    private StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[6];

        // done 1: Add 6 emploees to the staffList
        StaffMember se1 = new StaffMember("Moaath Alrajab", "202 4th street", "6318482200");
        StaffMember se2 = new StaffMember("Rinku Sarkar", "50 20th street", "6318485588");
        StaffMember se3 = new StaffMember("Tifanny chan", "55 1st street", "6312025544");
        StaffMember se4 = new StaffMember("JOhn doe", "11 20th street", "6318464588");
        StaffMember se5 = new StaffMember("The Rock", "19 25th street", "6315555588");
        StaffMember se6 = new StaffMember("Kevin Hart", "80 10th street", "6318489999");

        staffList[0] = se1;
        staffList[1] = se1;
        staffList[2] = se1;
        staffList[3] = se1;
        staffList[4] = se1;
        staffList[5] = se1;
        
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
