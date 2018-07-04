//Employee superclass provides a base-level class for a generic employee
//Specific implementations are handled by child classes like 
//CommissionEmployee and BasePlusCommissionEmployee.
// Aaron Roach - CSIS_312-D02

public class Employee
{
    //instance variables available to all subclasses via get methods
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    //three-argument constructor
    public Employee(String firstName, String lastName,
    String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //get methods
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }


    //toString superclass Object method override
    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n",  
        "commission employee", getFirstName(), getLastName(), 
        "social security number", getSocialSecurityNumber());
    }

}//end of class Employee