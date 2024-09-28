package ps3;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeePass;
    private String employeeName;
    private String designation;
    private String department;
    private String dateOfJoining;
    private int totalWorkingDays;
    private int basic;
    private int hra;
    private String uan;
    private int pfNo;
    private int esiNo;
    private String bank;
    private int accountNo;
    private int leaves;
    private int conveyanceAllowance;
    private int medicalAllowance;
    private int otherAllowances;
    private int professionalTax;

    public Employee(String employeeId, String employeeName, String employeePass, String designation, String department, String dateOfJoining, int totalWorkingDays, int basic, int hra, String uan, int pfNo, int esiNo, String bank, int accountNo, int leaves, int conveyanceAllowance, int medicalAllowance, int otherAllowances, int professionalTax) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePass = employeePass;
        this.designation = designation;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
        this.totalWorkingDays = totalWorkingDays;
        this.basic = basic;
        this.hra = hra;
        this.uan = uan;
        this.pfNo = pfNo;
        this.esiNo = esiNo;
        this.bank = bank;
        this.accountNo = accountNo;
        this.leaves = leaves;
        this.conveyanceAllowance = conveyanceAllowance;
        this.medicalAllowance = medicalAllowance;
        this.otherAllowances = otherAllowances;
        this.professionalTax = professionalTax;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeePass() {
        return employeePass;
    }

    public void setEmployeePass(String employeePass) {
        this.employeePass = employeePass;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public int getHra() {
        return hra;
    }

    public void setHra(int hra) {
        this.hra = hra;
    }

    public String getUan() {
        return uan;
    }

    public void setUan(String uan) {
        this.uan = uan;
    }

    public int getPfNo() {
        return pfNo;
    }

    public void setPfNo(int pfNo) {
        this.pfNo = pfNo;
    }

    public int getEsiNo() {
        return esiNo;
    }

    public void setEsiNo(int esiNo) {
        this.esiNo = esiNo;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    public int getConveyanceAllowance() {
        return conveyanceAllowance;
    }

    public void setConveyanceAllowance(int conveyanceAllowance) {
        this.conveyanceAllowance = conveyanceAllowance;
    }

    public int getMedicalAllowance() {
        return medicalAllowance;
    }

    public void setMedicalAllowance(int medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
    }

    public int getOtherAllowances() {
        return otherAllowances;
    }

    public void setOtherAllowances(int otherAllowances) {
        this.otherAllowances = otherAllowances;
    }

    public int getProfessionalTax() {
        return professionalTax;
    }

    public void setProfessionalTax(int professionalTax) {
        this.professionalTax = professionalTax;
    }

    public void displayPaySlip(String employeeId, ArrayList<Employee> employees) {

        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {

                LocalDate currentDate = LocalDate.now();
                Month currentMonth = currentDate.getMonth();
                int currentYear = currentDate.getYear();
                int lopDays = 0;
                if (employee.getLeaves() > 5) {
                    lopDays = employee.getLeaves() - 5;
                }
                int paidDays = employee.getTotalWorkingDays() - lopDays;
                int totalEarnings = employee.getBasic() + employee.getHra() + employee.getConveyanceAllowance() + employee.getOtherAllowances() + employee.getMedicalAllowance();
                int lop = ((totalEarnings / employee.getTotalWorkingDays()) * lopDays);
                int epf = totalEarnings * 12 / 100;
                int esi = totalEarnings * 4 / 100;
                int totalDeductions = epf + esi + employee.getProfessionalTax() + lop;
                int netSalary = totalEarnings - totalDeductions;
                System.out.println("\nLAXMI CHIT FUND\nPay Slip for " + currentMonth + " " + currentYear);
                System.out.println("----------------------------------------------------------------------------");

                System.out.println("Employee ID:  " + employee.getEmployeeId());
                System.out.println("Employee Name: " + employee.getEmployeeName());
                System.out.println("Designation: " + employee.getDesignation());
                System.out.println("Department: " + employee.getDepartment());
                System.out.println("Date of Joining: " + employee.getDateOfJoining());
                System.out.println("UAN: " + employee.getUan());
                System.out.println("PF No: " + employee.getPfNo());
                System.out.println("ESI No: " + employee.getEsiNo());
                System.out.println("Bank: " + employee.getBank());
                System.out.println("Account No: " + employee.getAccountNo());
                System.out.println("----------------------------------------------------------------------------");

                System.out.println("Gross Wages: ₹" + totalEarnings);
                System.out.println("Total Working Days: " + employee.getTotalWorkingDays());
                System.out.println("LOP Days: " + lopDays);
                System.out.println("Leaves: " + employee.getLeaves());
                System.out.println("Paid Days: " + paidDays);
                System.out.println("----------------------------------------------------------------------------");

                System.out.println("Earnings\nBasic: ₹" + employee.getBasic());
                System.out.println("HRA: ₹" + employee.getHra());
                System.out.println("Conveyance Allowance: ₹" + employee.getConveyanceAllowance());
                System.out.println("Medical Allowance: ₹" + employee.getMedicalAllowance());
                System.out.println("Other Allowances: ₹" + employee.getOtherAllowances());
                System.out.println("Total Earnings: ₹" + totalEarnings);
                System.out.println("----------------------------------------------------------------------------");

                System.out.println("Deductions\nEPF: ₹" + epf);
                System.out.println("ESI: ₹" + esi);
                System.out.println("Professional Tax: ₹" + employee.getProfessionalTax());
                System.out.println("Loss of Pay: ₹" + lop);
                System.out.println("Total Deductions: ₹" + totalDeductions);
                System.out.println("----------------------------------------------------------------------------");

                System.out.println("Net Salary: ₹" + netSalary);
                System.out.println("----------------------------------------------------------------------------");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public void updateData(String employeeId, ArrayList <Employee> employees) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                while (true) { 
                    System.out.println("\nSelect the Data to Update\n1: Employee Name\n2: Employee Password\n3: Return");
                    Scanner sc = new Scanner(System.in);
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1 -> {
                            System.out.println("Current Employee Name: " + employee.getEmployeeName());
                            System.out.println("Enter New Name: ");
                            String newName = sc.nextLine();
                            employee.setEmployeeName(newName);
                            System.out.println("Employee Name Updated to " + newName);
                        }
                        case 2 -> {
                            System.out.print("\nEnter Old Password: ");
                            String oldPass = sc.nextLine();
                            if (oldPass.equals(employee.getEmployeePass())) {
                                System.out.print("\nEnter New Password: ");
                                String newPass = sc.nextLine();
                                employee.setEmployeePass(newPass);
                                System.out.println("Password Updated to " + newPass);
                            } else {
                                System.out.println("Incorrect Password");
                            }
                        }
                        case 3 -> {
                            System.out.println("\nReturning to Previous Menu");
                            return;
                        }
                    }
                }
            }
            System.out.println("Employee with ID " + employeeId + " not found.");
        }
    }

    public static Employee addEmployee() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int id = rd.nextInt(1000, 10000);
        String employeeId = "LCF" + id;
        System.out.println("Your Employee ID will be " + employeeId);

        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter Employee Password: ");
        String employeePass = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Date of Joining (DD/MM/YYYY): ");
        String dateOfJoining = sc.nextLine();

        System.out.print("Enter Total Working Days: ");
        int totalWorkingDays = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        int basic = sc.nextInt();

        System.out.print("Enter HRA: ");
        int hra = sc.nextInt();
        sc.nextLine();

        String uan = "UAN" + rd.nextInt(10000, 100000);

        int pfNo = rd.nextInt(10000, 100000);

        int esiNo = rd.nextInt(10000, 100000);

        System.out.print("Enter Bank: ");
        String bank = sc.nextLine();

        System.out.print("Enter Account No: ");
        int accountNo = sc.nextInt();

        System.out.print("Enter Conveyance Allowance: ");
        int conveyanceAllowance = sc.nextInt();

        System.out.print("Enter Medical Allowance: ");
        int medicalAllowance = sc.nextInt();

        System.out.print("Enter Other Allowances: ");
        int otherAllowances = sc.nextInt();

        System.out.print("Enter Professional Tax: ");
        int professionalTax = sc.nextInt();

        System.out.println("Employee added to portal");

        Employee newEmployee = new Employee(employeeId, employeeName, employeePass, designation, department, dateOfJoining, totalWorkingDays, basic, hra, uan, pfNo, esiNo, bank, accountNo, 0, conveyanceAllowance, medicalAllowance, otherAllowances, professionalTax);
        return newEmployee;
    }
}
