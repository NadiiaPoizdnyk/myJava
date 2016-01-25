/*
Junit provides a handy option of Timeout.
If a test case takes more time than specified number of milliseconds then Junit will automatically mark it as failed.
The timeout parameter is used along with @Test annotation.
 */

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(timeout=1000)                 //Add timeout of 1000 to testPrintMessage() test case.
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}