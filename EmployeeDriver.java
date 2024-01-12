/*
 * Student Name: Khwaja Yousuf Mohiyuddeen
 * Student Number: 041-079-310
 * Lab Section: 302
 */

import java.util.ArrayList;
import java.util.List;

// Driver class for Employee
public class EmployeeDriver {
    private static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee("Richard", "Johnson", 101, "F/T", 6500);
        Employee employee2 = new FullTimeEmployee("Amanda", "Jones", 102, "F/T", 5500);

        Employee employee3 = new PartTimeEmployee("John", "Ford", 501, "P/T", 50, 100);
        Employee employee4 = new PartTimeEmployee("Mike", "Casselman", 502, "P/T", 45, 120);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        // Display employee details
        for (Employee employee : employeeList) {
            employee.printEmployee();
        }
    }
}
