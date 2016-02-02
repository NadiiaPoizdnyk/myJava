/*
Sometimes it happens that our code is not ready and test case written to test that method/code will fail if run.
The @Ignore annotation helps in this regards.
A test method annotated with @Ignore will not be executed.
If a test class is annotated with @Ignore then none of its test methods will be executed.
 */

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

@Ignore       // Console:
                // true
public class TestJunit {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

   // @Ignore  // Console:
                // Inside testSalutationMessage()
                // Hi!Robert
                // true
    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        message = "Robert";
        assertEquals(message,messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}

/* Without @Ignore
Console:
Inside testSalutationMessage()
Hi!Robert
Inside testPrintMessage()
Robert
true
 */