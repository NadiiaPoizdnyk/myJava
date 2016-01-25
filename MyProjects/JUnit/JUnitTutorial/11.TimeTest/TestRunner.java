

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
Inside testSalutationMessage()
Hi!Robert
Inside testPrintMessage()
Robert
testPrintMessage(TestJunit): test timed out after 1000 milliseconds
false
 */
