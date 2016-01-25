
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[]args){

        Result result = JUnitCore.runClasses(TestSuite.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

/*
Compile all java classes using javac

C:\JUNIT_WORKSPACE>javac MessageUtil.java TestJunit1.java
TestJunit2.java JunitTestSuite.java TestRunner.java

C:\JUNIT_WORKSPACE>java TestRunner

Console:
Inside testPrintMessage()
Robert
Inside testSalutationMessage()
Hi Robert
true
 */