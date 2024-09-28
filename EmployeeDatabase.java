package ps3;
import java.util.ArrayList;

public class EmployeeDatabase {
    private ArrayList<Employee> employees;

    public EmployeeDatabase() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String employeeId) {

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeId().equals(employeeId)) {
                employees.remove(i);
                System.out.println("\nEmployee with ID " + employeeId + " removed successfully.");
                return;
            }
        }
        System.out.println("\nEmployee with ID " + employeeId + " not found.");
    }

    public void displayAllEmployees() {
        System.out.println("\nList of Employees:");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println((i + 1) + ". Employee ID: " + employee.getEmployeeId() + ", Employee Name: " + employee.getEmployeeName());
        }
        }
    }