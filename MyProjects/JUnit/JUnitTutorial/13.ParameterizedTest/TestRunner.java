/**
 * Junit 4 has introduced a new feature Parameterized tests.Parameterized tests allow developer
 * to run the same test over and over again using different values.
 * There are five steps, that you need to follow to create Parameterized tests.
 * Steps:
 * 1- Annotate test class with @RunWith(Parameterized.class)
 * 2- Create a public static method annotated with @Parameters that returns
 * a Collection of Objects (as Array) as test data set.
 * 3- Create a public constructor that takes in what is equivalent to one "row" of test data.
 * 4- Create an instance variable for each "column" of test data.
 * 5- Create your tests case(s) using the instance variables as the source of the test data.
 * The test case will be invoked once per each row of data.
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

/* Console:
Parameterized Number is : 2
Parameterized Number is : 6
Parameterized Number is : 19
Parameterized Number is : 22
Parameterized Number is : 23
true
 */