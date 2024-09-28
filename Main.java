package ps3;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static final String adminpass = "admin123";
    private static Admin admin = new Admin("","","","","","",0,0,0,"",0,0,"",0,0,0,0,0,0);
    public static void main(String[] args) {
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        ArrayList <Employee> employees = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("\nEmployee PaySlip Portal\n1. Admin\n2. Employee\n3. Exit\n\nSelect Your Role: ");
            int role = sc.nextInt();
            switch(role) {
                case 1 -> {
                    System.out.print("\nEnter Admin Password: ");
                    String admpass = sc.next();
                    Captcha cap = new Captcha();
                    if (cap.verifyCaptcha()) {
                        if (admpass.equals(adminpass)){
                            System.out.println("\nWelcome Admin");
                            while(true) {
                                System.out.print("\n1. View Employee PaySlip\n2.Update Employee Data\n3.View All Employees\n4.Add Employee\n5.Remove Employee\n6.Exit\n Select an Option: ");
                                int adminoption = sc.nextInt();
                                switch (adminoption) {
                                    case 1 -> {
                                        if(employees.isEmpty()){
                                            System.out.println("No Employees in the Database");
                                        }else {
                                            System.out.print("\nEnter Employee ID: ");
                                            String empid = sc.next();
                                            for (Employee employee : employees) {
                                                if (employee.getEmployeeId().equals(empid)) {
                                                    employee.displayPaySlip(empid, employees);
                                                    break;
                                                } else {
                                                    System.out.printf("\nEmployee with Employee ID %s not found.",empid);
                                                }
                                            }
                                        }
                                    }
                                    case 2 -> {
                                        if(employees.isEmpty()){
                                            System.out.println("No Employees in the Database");}
                                        else{
                                            System.out.print("\nEnter Employee ID: ");
                                            String empid = sc.next();
                                            admin.updateDataAdmin(empid, employees);}
                                    }
                                    case 3 -> {
                                        if(employees.isEmpty()){
                                            System.out.println("No Employees in the Database");}
                                        else{
                                            System.out.println("\nList of Employees:");
                                            employeeDatabase.displayAllEmployees();}
                                    }
                                    case 4 -> {
                                        System.out.println("\nAdd Employee:");
                                        Employee employee = Employee.addEmployee();
                                        employeeDatabase.addEmployee(employee);
                                        employees.add(employee);
                                        System.out.println("\nEmployee added successfully.");
                                    }
                                    case 5 -> {
                                        if(employees.isEmpty()){
                                            System.out.println("No Employees in the Database");}
                                        else{
                                            System.out.println("\nRemove Employee:");
                                            System.out.print("Enter Employee ID: ");
                                            String empId = sc.next();
                                            boolean found = false;
                                            for (int i = 0; i < employees.size(); i++) {
                                                if (employees.get(i).getEmployeeId().equals(empId)) {
                                                    employees.remove(i);
                                                    employeeDatabase.removeEmployee(empId);
                                                    found = true;
                                                    break;
                                                }
                                            }
                                            if (!found) {
                                                System.out.println("\nEmployee not found.");
                                            }
                                        }
                                    }
                                    case 6 -> {
                                        System.out.println("Exiting Admin Menu");
                                        break;
                                    }
                                    default -> {
                                        System.out.println("Invalid");
                                    }
                                }
                                if(adminoption == 6) {
                                    break;
                                }
                            }
                        }else{
                            System.out.println("\nIncorrect Password");
                        }
                    } else {
                        System.exit(0);
                    }

                }
                case 2 -> {
                    while(true) {
                        System.out.print("1. New User\n2. Existing User\n3. Return\n\nSelect an Option: ");
                        int empmenu1 = sc.nextInt();
                        Captcha cap = new Captcha();
                        if (cap.verifyCaptcha()) {
                            switch (empmenu1) {
                                case 1 -> {
                                    while(true) {
                                        System.out.print("\n1. Add Employee To Portal\n2. Return\n\nSelect an Option: ");
                                        int newemp = sc.nextInt();
                                        switch (newemp) {
                                            case 1 -> {
                                                Employee employee = Employee.addEmployee();
                                                employeeDatabase.addEmployee(employee);
                                                employees.add(employee);
                                            }
                                            case 2 -> {
                                                System.out.println("\nReturning to Employee Menu");
                                                break;
                                            }
                                        }
                                        if(newemp == 2) {
                                            break;
                                        }
                                    }
                                }
                                case 2 -> {
                                    if(employees.isEmpty()){
                                        System.out.println("No Employees in the Database");
                                    } else{
                                        while(true) {
                                            System.out.print("Enter Employee ID: ");
                                            String empid = sc.next();
                                            System.out.print("Enter Employee Password: ");
                                            String empPass = sc.next();
                                            for (Employee employee : employees) {
                                                if(empid.equals(employee.getEmployeeId())){
                                                    if(empPass.equals(employee.getEmployeePass())){
                                                        System.out.println("Welcome " + employee.getEmployeeName());
                                                        while(true) {
                                                            System.out.print("\n1. View Employee PaySlip\n2. Update Data\n3. Return\n\nSelect an Option: ");
                                                            int option = sc.nextInt();
                                                            switch (option){
                                                                case 1 -> {
                                                                    employee.displayPaySlip(empid, employees);
                                                                }
                                                                case 2 -> {
                                                                    employee.updateData(empid, employees);
                                                                }
                                                                case 3 -> {
                                                                    System.out.println("Returning to Main Menu");
                                                                    break;
                                                                }
                                                            }
                                                            if(option == 3) {
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                    }
                                }
                                case 3 -> {
                                    System.out.println("Exiting");
                                    break;
                                }
                                default -> {
                                    System.out.println("Invalid");
                                }
                            }
                        } else {
                            System.exit(0);
                        }
                        if(empmenu1 == 3) {
                            break;
                        }
                    }
                }
                case 3 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid");
                }
            }
        }
    }
}