package LAB4;

public class LabAssistant extends StaffMember{
    private int hoursWorked;
    private double hourlyRate;
    
    public LabAssistant(String staffID, String fullName , String department, int hoursWorked, double hourlyRate){
        super(staffID,fullName,department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public double calculateMonthlyPayment(){
        return hoursWorked * hourlyRate;
    }
    
    public void  displayLabAssistantDetails(){
        displayBasicDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
    
    // The 'department' field can be used here because it was declared as 'protected' in the parent class,
    // allowing direct access to all child classes (subclasses) regardless of the package.
    
}
