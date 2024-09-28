package ps3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Employee{

    public Admin(String employeeId, String employeeName, String employeePass, String designation, String department, String dateOfJoining, int totalWorkingDays, int basic, int hra, String uan, int pfNo, int esiNo, String bank, int accountNo, int leaves, int conveyanceAllowance, int medicalAllowance, int otherAllowances, int professionalTax) {
        super(employeeId, employeeName, employeePass, designation, department, dateOfJoining, totalWorkingDays, basic, hra, uan, pfNo, esiNo, bank, accountNo, leaves, conveyanceAllowance, medicalAllowance, otherAllowances, professionalTax);
    }

    public void updateDataAdmin(String employeeId, ArrayList <Employee> employees) {
        for(Employee employee : employees) {
            if(employeeId.equals(employee.getEmployeeId())) {
                System.out.println("\nSelect the Data to Update: \n1. Employee Name \n2. Employee Password \n3. Designation \n4. Department \n5. Date Of Joining \n6. Total Working Days \n7. Basic Salary \n8. HRA \n9. UAN \n10. PF No \n11. ESI No \n12. Bank \n13. Account No \n14. Leaves \n15. Conveyance Allowance \n16. Medical Allowance \n17. Other Allowances \n18. Professional Tax\n0. Return to Previous Menu");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("\nCurrent Employee Name: " + employee.getEmployeeName());
                        System.out.print("\nEnter the new Employee Name: ");
                        String newName = sc.next();
                        employee.setEmployeeName(newName);
                        System.out.println("\nEmployee Name Updated to " + newName);
                    }
                    case 2 -> {
                        System.out.println("\nCurrent Employee Password: " + employee.getEmployeePass());
                        System.out.print("\nEnter the new Employee Password: ");
                        String newPassword = sc.next();
                        employee.setEmployeePass(newPassword);
                        System.out.println("\nEmployee Password Updated to " + newPassword);
                    }
                    case 3 -> {
                        System.out.println("\nCurrent Employee Designation: " + employee.getDesignation());
                        System.out.print("\nEnter the new Employee Designation: ");
                        String newDesignation = sc.next();
                        employee.setDesignation(newDesignation);
                        System.out.println("\nEmployee Designation Updated to " + newDesignation);
                    }
                    case 4 -> {
                        System.out.println("\nCurrent Employee Department: " + employee.getDepartment());
                        System.out.print("\nEnter the new Employee Department: ");
                        String newDepartment = sc.next();
                        employee.setDepartment(newDepartment);
                        System.out.println("\nEmployee Department Updated to " + newDepartment);
                    }
                    case 5 -> {
                        System.out.println("\nCurrent Employee Date of Joining: " + employee.getDateOfJoining());
                        System.out.print("\nEnter the new Employee Date of Joining: ");
                        String newDateOfJoining = sc.next();
                        employee.setDateOfJoining(newDateOfJoining);
                        System.out.println("\nEmployee Date of Joining Updated to " + newDateOfJoining);
                    }
                    case 6 -> {
                        System.out.println("\nCurrent Employee Total Working Days: " + employee.getTotalWorkingDays());
                        System.out.print("\nEnter the new Employee Total Working Days: ");
                        int newTotalWorkingDays = sc.nextInt();
                        employee.setTotalWorkingDays(newTotalWorkingDays);
                        System.out.println("\nEmployee Total Working Days Updated to " + newTotalWorkingDays);
                    }
                    case 7 -> {
                        System.out.println("\nCurrent Employee Basic Salary: " + employee.getBasic());
                        System.out.print("\nEnter the new Employee Basic Salary: ");
                        int newBasic = sc.nextInt();
                        employee.setBasic(newBasic);
                        System.out.println("\nEmployee Basic Salary Updated to " + newBasic);
                    }
                    case 8 -> {
                        System.out.println("\nCurrent Employee HRA: " + employee.getHra());
                        System.out.println("Enter the new Employee HRA: ");
                        int newHra = sc.nextInt();
                        employee.setHra(newHra);
                        System.out.println("\nEmployee HRA Updated to " + newHra);
                    }
                    case 9 -> {
                        System.out.println("\nCurrent Employee UAN: " + employee.getUan());
                        System.out.println("Enter the new Employee UAN: ");
                        String newUan = sc.next();
                        employee.setUan(newUan);
                        System.out.println("\nEmployee UAN Updated to " + newUan);
                    }
                    case 10 -> {
                        System.out.println("\nCurrent Employee PF No: " + employee.getPfNo());
                        System.out.println("Enter the new Employee PF No: ");
                        int newPfNo = sc.nextInt();
                        employee.setPfNo(newPfNo);
                        System.out.println("\nEmployee PF No Updated to " + newPfNo);
                    }
                    case 11 -> {
                        System.out.println("\nCurrent Employee ESI No: " + employee.getEsiNo());
                        System.out.println("Enter the new Employee ESI No: ");
                        int newEsino = sc.nextInt();
                        employee.setEsiNo(newEsino);
                        System.out.println("\nEmployee ESI No Updated to " + newEsino );
                    }
                    case 12 -> {
                        System.out.println("\nCurrent Employee Bank: " + employee.getBank());
                        System.out.println("Enter the new Employee Bank: ");
                        String newBank = sc.next();
                        employee.setBank(newBank);
                        System.out.println("\nEmployee Bank Updated to " + newBank);
                    }
                    case 13 -> {
                        System.out.println("\nCurrent Employee Account No: " + employee.getAccountNo());
                        System.out.println("Enter the new Employee Account No: ");
                        int newAccountNo = sc.nextInt();
                        employee.setAccountNo(newAccountNo);
                        System.out.println("\nEmployee Account No Updated to " + newAccountNo);
                    }
                    case 14 -> {
                        System.out.println("\nCurrent Employee Leaves: " + employee.getLeaves());
                        System.out.println("Enter the new Employee Leaves: ");
                        int newLeaves = sc.nextInt();
                        employee.setLeaves(newLeaves);
                        System.out.println("\nEmployee Leaves Updated to " + newLeaves);
                    }
                    case 15 -> {
                        System.out.println("\nCurrent Employee Conveyance Allowance: " + employee.getConveyanceAllowance());
                        System.out.println("Enter the new Employee Conveyance Allowance: ");
                        int newConveyanceAllowance = sc.nextInt();
                        employee.setConveyanceAllowance(newConveyanceAllowance);
                        System.out.println("\nEmployee Conveyance Allowance Updated to " + newConveyanceAllowance);
                    }
                    case 16 -> {
                        System.out.println("\nCurrent Employee Medical Allowance: " + employee.getMedicalAllowance());
                        System.out.println("Enter the new Employee Medical Allowance: ");
                        int newMedicalAllowance = sc.nextInt();
                        employee.setMedicalAllowance(newMedicalAllowance);
                        System.out.println("\nEmployee Medical Allowance Updated to " + newMedicalAllowance);
                    }
                    case 17 -> {
                        System.out.println("\nCurrent Employee Other Allowance: " + employee.getOtherAllowances());
                        System.out.println("Enter the new Employee Other Allowance: ");
                        int newOtherAllowance = sc.nextInt();
                        employee.setOtherAllowances(newOtherAllowance);
                        System.out.println("\nEmployee Other Allowance Updated to " + newOtherAllowance);
                    }
                    case 18 -> {
                        System.out.println("\nCurrent Employee Professional Tax: " + employee.getProfessionalTax());
                        System.out.println("Enter the new Employee Professional Tax: ");
                        int newProfessionalTax = sc.nextInt();
                        employee.setProfessionalTax(newProfessionalTax);
                        System.out.println("\nEmployee Professional Tax Updated to " + newProfessionalTax);
                    }
                    case 19 -> {
                        System.out.println("\nReturning to Previous Menu");
                        return;
                    }
                }   
            }
    
        }
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
                System.out.println("Employee Password:  " + employee.getEmployeePass());
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
}