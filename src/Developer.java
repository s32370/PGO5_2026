public class Developer extends Employee{

    private String mainLanguage;
    private int repositoryCount;

    //  a constructor calling super(...),
    public Developer(String employeeId, String firstName,
                     String lastName, double baseSalary,
                     String mainLanguage, int repositoryCount){
        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }



  //  This class should contain:

  //  an overridden calculateMonthlyCost(),

    @java.lang.Override
    public double calculateMonthlyCost() {
        return super.calculateMonthlyCost();
    }

    //  an overridden introduceYourself(),

    @java.lang.Override
    public String introduceYourself() {
        return super.introduceYourself();
    }

    //   a specific method such as printTechnologies(),
    public void printTechnologies(){
    }
  //  optionally a more detailed toString().

}
