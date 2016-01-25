/*
Junit provides a option of tracing the Exception handling of code.
You can test the code whether code throws desired exception or not.
The expected parameter is used along with @Test annotation.
@Test(expected)
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
