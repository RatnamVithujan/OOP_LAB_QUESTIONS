package LAB4;

abstract class StaffMember{
    private final String staffID;
    private String fullName;
    protected String department;
    private static int staffCount = 0;
    
    public StaffMember(String staffID, String fullName , String department){
        this.staffID = staffID;
        this.fullName = fullName;
        this.department = department;
        staffCount++;
    }
    
    public static void showSystemName(){
        System.out.println(">>> University Staff Payment System <<<");
    }
    
    public static int getStaffCount(){
        return staffCount;
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
    
    public void changeDepartment(String newDepartment){
        if (!newDepartment.isEmpty()){
            this.department = newDepartment;
        }
    }
    
    public final void showCommonNotice(){
        System.out.println("Notice: Please submit your timesheets by the 25th of each month.");
    }
    
    public final void displayBasicDetails(){
        System.out.println("Staff ID: " + staffID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
    }
    
    public abstract double calculateMonthlyPayment();
    
    //Why this is abstract because prevent the incomplete objects
    //It is static because it belongs to the Class itself
}
