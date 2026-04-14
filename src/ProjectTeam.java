import java.util.ArrayList;

public class ProjectTeam {

    private String projectName;
    private ArrayList<Employee> employees = new ArrayList<>();

    // Example methods:
    public ProjectTeam(String projectName) {
        this.projectName = projectName;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printTeamMembers() {
        System.out.println();
    }

    public double calculateTotalCost() {
        double Total = 0;
        for (Employee e : employees) {
            Total += e.calculateMonthlyCost();
        }
        return Total;
    }

    public Employee findById(String employeeId) {
        for (Employee e : employees) {
            if (e.getEmployeeId().equals(employeeId)) {
                return e;
            }
        }
    }

    public void printDevelopers() { //or
        for (Employee e : employees){
            if (e instanceof Developer){
                System.out.println(e);
            }
        }
    }

    public void printAutomationTesters() { //using instanceof.
        for (Employee e : employees){
            if (e instanceof Tester){
                System.out.println(e);
            }
        }
    }

}
