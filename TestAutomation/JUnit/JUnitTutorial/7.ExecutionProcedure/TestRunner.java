import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[]args){

        Result result = JUnitCore.runClasses(ExecutionProcedureJunit.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

/* Condole:
in before
in test case 1
in after
in before
in test case 2
in after
in after class
true
 */