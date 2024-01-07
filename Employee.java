/*Student Name: Khwaja Yousuf Mohiyuddeen
 *Student Number: 041-079-310
 *Lab Section: 302 
 */

	// Employee class
public class Employee {
    protected String firstName;
    protected String lastName;
    protected int employeeNumber;
    protected String employeeType;

    // Parameterized constructor
    public Employee(String firstName, String lastName, int employeeNumber, String employeeType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.employeeType = employeeType;
    }

    // Getter method to display full name
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    // Method to print employee details
    public void printEmployee() {
        System.out.printf("%s | %6d | %20s |", this.employeeType, this.employeeNumber, getName());
    }
}
