package core;

/*
* Create Test Runner Class
* Create a TestRunner java class.
* Use runClasses method of JUnitCore class of JUnit to run test case of above created test class
* Get the result of test cases run in Result Object
* Get failure(s) using getFailures() methods of Result object
* Get Success result using wasSuccessful() methods of Result object
*/

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitTestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}