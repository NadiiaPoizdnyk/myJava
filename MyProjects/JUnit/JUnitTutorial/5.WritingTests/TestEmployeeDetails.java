/** #3
 * TestEmployeeDetails.java contains test cases to be tested
 *
 * TestEmployeeDetails class is used for testing the methods of EmpBusinessLogic class.
 * It tests:
 * the yearly salary of the employee.
 * he appraisal amount of the employee.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestEmployeeDetails {

    EmpBusinessLogic empBusinessLogic =new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    //test to check appraisal
    @Test
    public void testCalculateAppriasal() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double appraisal= empBusinessLogic.calculateAppraisal(employee);
        assertEquals(500, appraisal, 0.0);
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double salary= empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
    }

}
