import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollMain {

    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    private static List<Employee> employeePayrollList;

    public EmployeePayrollMain(List<Employee> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) {
        /***
         * PROCEDURE
         * 1. calling readEmployeePayRollData and writeEmployeePayRollData methods
         * 2. created readEmployeePayRollData method
         * 3. created writeEmployeePayRollData method
         */
        // scanner to read input from console
        Scanner consoleInputReader = new Scanner(System.in);
        List<Employee> employeePayrollList = new ArrayList<Employee>();
        EmployeePayrollMain employeePayrollMain = new EmployeePayrollMain(employeePayrollList);
        /***
         * 1. calling readEmployeePayRollData and writeEmployeePayRollData methods
         */
        employeePayrollMain.readEmployeePayrollData(consoleInputReader);
        employeePayrollMain.writeEmployeePayrollData();
    }

    /***
     * 2. created readEmployeePayRollData method to read data
     * @param consoleInputReader - giving input from the console
     */
    private static void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.print("Enter Employee ID : ");
        int id = consoleInputReader.nextInt();
        System.out.print("Enter Employee Name : ");
        String name = consoleInputReader.next();
        System.out.print("Enter Employee Salary : ");
        double salary = consoleInputReader.nextDouble();
        //adding details to the array list
        employeePayrollList.add(new Employee(id, name, salary));
    }

    /***
     * 3. created writeEmployeePayRollData method to print the data
     */
    private static void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
    }
}
