
public class Employee {


    private String employeeId;
    private String firstName;
    private String lastName;
    private double baseSalary;


    //This class may contain:
    //a constructor that initializes the shared fields,

    public Employee(String employeeId, String firstName, String lastName, double baseSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }


    //getters for shared data,
    public final String getEmployeeId(){
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateMonthlyCost(){
        return baseSalary;
    }

    public String introduceYourself(){
        return "I am an employee: " + firstName + " " + lastName;
    }

    @Override
    toString()

    @Override
    equals() //comparing objects by employeeId.
}
