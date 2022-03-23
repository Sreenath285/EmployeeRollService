import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollMain {

    //created an object of Array list class
    static List<Employee> employeePayrollList = new ArrayList<>();

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
        Scanner consoleInputReader = new Scanner(System.in);
        /***
         * 1. calling readEmployeePayRollData and writeEmployeePayRollData methods
         */
        EmployeePayrollMain.readEmployeePayRollData(consoleInputReader);
        EmployeePayrollMain.writeEmployeePayRollData();
    }

    /***
     * 2. created readEmployeePayRollData method to read data
     * @param consoleInputReader - giving input from the console
     */
    private static void readEmployeePayRollData(Scanner consoleInputReader) {
        System.out.print("Enter Employee ID : ");
        int id = consoleInputReader.nextInt();
        System.out.print("Enter Employee Name : ");
        String name = consoleInputReader.next();
        System.out.print("Enter Employee Salary : ");
        double salary = consoleInputReader.nextDouble();
        //Adding details to the array list
        employeePayrollList.add(new Employee(id, name, salary));

    }

    /***
     * 3. created writeEmployeePayRollData method to print the data
     */
    private static void writeEmployeePayRollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
    }
}
