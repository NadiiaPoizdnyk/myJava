/**
 * The test cases are executed using JUnitCore class.
 * To run tests from the command line, run java org.junit.runner.JUnitCore <TestClass>.
 * For one-shot test runs, use the static method runClasses(Class[]).
 * Following is the declaration for org.junit.runner.JUnitCore class:
 *
 * public class JUnitCore extends java.lang.Object
 *
 * Create Test Runner Class to execute Test case(s) which import the JUnitCore class and uses the runClasses() method
 * which take the test class name as parameter.
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[]args){

        Result result = JUnitCore.runClasses(TestJunit.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

/* Console:
Hello World
true
 */