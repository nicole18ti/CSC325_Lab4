package com.mycompany.agency;

public class Staff {

    private StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[6];

        // done 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Moaath Alrajab", "202 4th street", "6318482200", "555-22-6666", 20);
        staffList[1] = new StaffEmployee("Rafael S", "19 25th street", "6315555588", "333-51-7893", 40);
        staffList[2] = new StaffEmployee("Tifanny chan", "55 1st street", "6312025544", "888-5-5252", 10);
        staffList[3] = new TempEmploee("Rinku Sarkar", "50 20th street", "6318485588", "444-88-6363", 44);
        staffList[4] = new Intern("JOhn doe", "11 20th street", "6318464588");
        staffList[5] = new StaffEmployee("Kevin Hart", "80 10th street", "6318489999", "777-85-9658", 50);

        ((Executive)staffList[0]).awardBonus(500.00);

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
