package excercise.encapsulation;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeName("Ramcharan");
        System.out.println(employee.getEmployeeName());

        employee.setEmployeeID(1221);
        System.out.println(employee.getEmployeeID());

        employee.setEmployeeTeam("Core Team");
        System.out.println(employee.getEmployeeTeam());


    }
}
