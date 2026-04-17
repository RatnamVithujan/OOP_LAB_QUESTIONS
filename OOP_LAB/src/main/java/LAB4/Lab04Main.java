package LAB4;

public class Lab04Main {
    public static void main(String[] args){
        Lecturer lec1 = new Lecturer("L001","Dr. Jehan", "Computer Science", 3, 5000.0);
        
        System.out.println("--- Lecturer Information ---");
        lec1.displayLecturerDetails();
        
        System.out.println("Total Monthly Payment: " + lec1.calculateMonthlyPayment());
    }
}
