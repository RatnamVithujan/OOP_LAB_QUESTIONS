package LAB4;

public class Lab04Main {
    public static void main(String[] args){
        
        StaffMember.showSystemName();
        System.out.println();
        
        UniversityPolicy.showPolicyHeader();
        System.out.println("University Name: " + UniversityPolicy.UNIVERSITY_NAME);
        System.out.println();
        
        Lecturer lec1 = new Lecturer("L001","Dr. Jehan", "Physics and Electronics", 3, 15000.0);
        Lecturer lec2 = new Lecturer("L002","Dr. Prabth", "Physics", 2, 25000.0);
        LabAssistant assistant1 = new LabAssistant("A001","Ratnam Vithujan", "Electronics", 40, 250.0);
        //==================================================================================================
        lec1.changeDepartment("Electronics");
        
        System.out.println("--- Lecturer Information ---");
        lec1.displayLecturerDetails();
        System.out.println("Total Monthly Payment: " + lec1.calculateMonthlyPayment());
        System.out.println("Estimated Bonus: " + UniversityPolicy.calculateBonus(lec1.calculateMonthlyPayment()));
        lec1.showCommonNotice();
        
        System.out.println();
        lec2.displayLecturerDetails();
        System.out.println("Total Monthly Payment: " + lec2.calculateMonthlyPayment());
        System.out.println("Estimated Bonus: " + UniversityPolicy.calculateBonus(lec2.calculateMonthlyPayment()));
        lec2.showCommonNotice();
        
        System.out.println("\n------------------------\n");
        
        System.out.println("--- Lab Assistant Details ---");
        assistant1.displayLabAssistantDetails();
        System.out.println("Total Monthly Payment: " + assistant1.calculateMonthlyPayment());
        System.out.println("Estimated Bonus: " + UniversityPolicy.calculateBonus(assistant1.calculateMonthlyPayment()));
        assistant1.showCommonNotice();
        
        System.out.println();
        System.out.println("Total Number of Staffs: " + StaffMember.getStaffCount());
        System.out.println();
        StaffMember[] staffList = {lec1,lec2,assistant1};
        double total =0;
        for(int i = 0; i < staffList.length; i++){
            double basePay = staffList[i].calculateMonthlyPayment();
            double bonus = UniversityPolicy.calculateBonus(basePay);
            total += (basePay + bonus);
        }
        System.out.println("Total Cost Per Month: " + total);
    }
}
