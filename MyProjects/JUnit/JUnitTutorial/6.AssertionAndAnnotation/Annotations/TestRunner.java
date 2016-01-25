package Annotations;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[]args){

        Result result = JUnitCore.runClasses(JunitAnnotation.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

/* Console:
in before class
in before
in test
in after
in after class
true
 */