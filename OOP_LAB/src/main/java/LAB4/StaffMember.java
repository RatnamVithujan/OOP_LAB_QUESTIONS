package LAB4;

abstract class StaffMember{
    private final String staffID;
    private String fullName;
    protected String department;
    
    public StaffMember(String staffID, String fullName , String department){
        this.staffID = staffID;
        this.fullName = fullName;
        this.department = department;
    }
    
    public String getstaffID(){
        return staffID;
    }
    public String getfullName(){
        return fullName;
    }
    public String getdepartment(){
        return department;
    }
    
    public final void displayBasicDetails(){
        System.out.println("Staff ID: " + staffID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
    }
    
    public abstract double calculateMonthlyPayment();
    
    //Why this is abstract because prevent the incomplete objects
}
