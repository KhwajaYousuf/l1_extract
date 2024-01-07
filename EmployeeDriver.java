/*Student Name: Khwaja Yousuf Mohiyuddeen
 *Student Number: 041-079-310
 *Lab Section: 302 
 */

import java.util.ArrayList;
import java.util.List;

	// Driver class for Employee
public class EmployeeDriver {
    private static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmp1 = new FullTimeEmployee("Richard", "Johnson", 101, "F/T", 6500);
        FullTimeEmployee fullTimeEmp2 = new FullTimeEmployee("Amanda", "Jones", 102, "F/T", 5500);

        PartTimeEmployee partTimeEmp1 = new PartTimeEmployee("John", "Ford", 501, "P/T", 50, 100);
        PartTimeEmployee partTimeEmp2 = new PartTimeEmployee("Mike", "Casselman", 502, "P/T", 45, 120);

        employeeList.add(fullTimeEmp1);
        employeeList.add(fullTimeEmp2);
        employeeList.add(partTimeEmp1);
        employeeList.add(partTimeEmp2);

        for (Employee e : employeeList) {
            e.printEmployee();
        }
    }
}
