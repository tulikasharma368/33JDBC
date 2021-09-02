package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() { }
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
//        List<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
//        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
//        Scanner consoleInputReader = new Scanner(System.in);
       // employeePayrollService.readEmployeePayrollData(consoleInputReader);
        //employeePayrollService.writeEmployeePayrollData(null);
    }

//    private void readEmployeePayrollData(Scanner consoleInputReader) {
//        System.out.println("Enter Employee ID: ");
//        int id = consoleInputReader.nextInt();
//        System.out.println("Enter Employee Name: ");
//        String name = consoleInputReader.next();
//        System.out.println("Enter Employee Salary: ");
//        double salary = consoleInputReader.nextDouble();
//        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
//        consoleInputReader.close();
//    }

    public List<EmployeePayrollData> readEmployeePayrollData(IOService ioService) {
        if (ioService.equals(IOService.DB_IO))
            this.employeePayrollList = new EmployeePayrollDBService().readData();
        return  this.employeePayrollList;
    }

//    public void writeEmployeePayrollData(IOService ioService) {
//        if (ioService.equals(IOService.CONSOLE_IO))
//            System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
//        else if (ioService.equals(IOService.FILE_IO))
//            new EmployeePayrollFileService().writeData(employeePayrollList);
//    }

//    public void printData(IOService ioService) {
//        if (ioService.equals(IOService.FILE_IO))
//            new EmployeePayrollFileService().printData();
//    }
}
