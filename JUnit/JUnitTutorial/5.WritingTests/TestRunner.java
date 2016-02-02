/** #4
 * to execute Test case(s)
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(TestEmployeeDetails.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

// Compile: (cmd) >javac EmployeeDetails.java EmpBusinessLogic.java TestEmployeeDetails.java TestRunner.java
//run the Test Runner which will run test case defined in provided Test Case class: (cmd) >java TestRunner
