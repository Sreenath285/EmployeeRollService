import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmployeePayrollMainTest {

    @Test
    void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() {
        Employee[] arrayOfEmp = { new Employee(1, "Jeff Bezos", 100000.0),
                                  new Employee(2, "Bill Gates", 200000.0),
                                  new Employee(3, "Mark Zuckerberg", 300000.0) };
        EmployeePayrollMain employeePayrollService;
        employeePayrollService = new EmployeePayrollMain(Arrays.asList(arrayOfEmp));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollMain.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(EmployeePayrollMain.IOService.FILE_IO);
        assertEquals(3, entries);
    }

}