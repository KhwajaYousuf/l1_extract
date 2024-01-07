/*Student Name: Khwaja Yousuf Mohiyuddeen
 *Student Number: 041-079-310
 *Lab Section: 302 
 */

	// FullTimeEmployee inheriting from Employee
public class FullTimeEmployee extends Employee {
	
    private double salary;

    // Parameterized constructor
    public FullTimeEmployee(String firstName, String lastName, int employeeNumber, String employeeType, double salary) {
    	
        super(firstName, lastName, employeeNumber, employeeType);
        this.salary = salary;
    }

    // Method to print fulltime employee details 
    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.printf(" %10.1f$|%n", this.salary);
    }
}
