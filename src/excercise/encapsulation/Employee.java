package excercise.encapsulation;

public class Employee {
    private String employeeName;
    private int employeeID;
    private String employeeTeam;

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeTeam() {
        return employeeTeam;
    }
    public void setEmployeeTeam(String employeeTeam) {
        this.employeeTeam = employeeTeam;
    }
}
