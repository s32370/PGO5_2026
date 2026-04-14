public class Tester extends Employee {
    //A child class representing a tester in the project team.
    //Example fields:
    private boolean automationTester;
    private int scenarioCount;


    //This class should contain:

    //a constructor calling super(...),
    public Tester(String employeeId, String firstName,
                  String lastName, double baseSalary,
                  boolean automationTester,int scenarioCount){
        super(employeeId, firstName, lastName, baseSalary); //super(...)
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    //an overridden calculateMonthlyCost(),
    @java.lang.Override
    public double calculateMonthlyCost() {
        return super.calculateMonthlyCost();
    }

    //an overridden introduceYourself(),
    @java.lang.Override
    public String introduceYourself() {
        return super.introduceYourself();
    }

    //a specific method such as runTestingReport(),
    public void runTestingReport(){
    //!!!!! finish
    }

    //getters for tester-specific fields.
    public boolean isAutomationTester() {
        return automationTester;
    }

    public int getScenarioCount() {
        return scenarioCount;
    }
}
