package LAB4;

public class Lab04Main {
    public static void main(String[] args){
        Lecturer lec1 = new Lecturer("L001","Dr. Jehan", "Computer Science", 3, 5000.0);
        LabAssistant assistant1 = new LabAssistant("A001","Ratnam Vithujan", "Electronics", 40, 250.0);
        
        System.out.println("--- Lecturer Information ---");
        lec1.displayLecturerDetails();
        System.out.println("Total Monthly Payment: " + lec1.calculateMonthlyPayment());
        
        System.out.println("\n------------------------\n");
        
        System.out.println("--- Lab Assistant Details ---");
        assistant1.displayLabAssistantDetails();
        System.out.println("Total Monthly Payment: " + assistant1.calculateMonthlyPayment());
    }
}
