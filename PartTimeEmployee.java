/*Student Name: Khwaja Yousuf Mohiyuddeen
 *Student Number: 041-079-310
 *Lab Section: 302 
 */

	// PartTimeEmployee inheriting from Employee
public class PartTimeEmployee extends Employee {
	
    private double hourlyRate;
    private double numOfHours;

    // Parameterized constructor
    public PartTimeEmployee(String firstName, String lastName, int employeeNumber, String employeeType, double hourlyRate, double numOfHours) {
    	
        super(firstName, lastName, employeeNumber, employeeType);
        this.hourlyRate = hourlyRate;
        this.numOfHours = numOfHours;
    }

    // Method to print parttime employee details
    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.printf(" %10.1f$|%n", this.hourlyRate * this.numOfHours);
    }
}
