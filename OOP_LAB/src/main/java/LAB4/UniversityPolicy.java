package LAB4;

public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "University of Kelanniya";
    public static final double BONUS_RATE = 0.10;//10%
    
    public static void showPolicyHeader(){
        System.out.println("====================================");
        System.out.println("   OFFICIAL UNIVERSITY PAYMENT POLICY");
        System.out.println("====================================");
    }
    
    public static double calculateBonus(double monthlyPayment){
        return monthlyPayment * BONUS_RATE;
    }
    
    /*A final class is a "complete" design. We prevent inheritance to ensure 
    that its security, logic, and constants cannot be changed or 
    misrepresented by a subclass.*/
}
