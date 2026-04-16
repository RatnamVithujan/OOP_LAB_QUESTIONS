package LAB4;

abstract class StaffMember{
    private final String staffId;
    private String fullName;
    protected String department;
    
    public StaffMember(String staffId, String fullName , String department){
        this.staffId = staffId;
        this.fullName = fullName;
        this.department = department;
    }
}
