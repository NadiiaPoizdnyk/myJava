package core;
/*
* Create Test Case Class
* Create a java test class say TestJunit.java.
* Add a test method testPrintMessage() to your test class.
* Add an Annotaion @Test to method testPrintMessage().
* Implement the test condition and check the condition using assertEquals API of Junit.
*/

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        //assertEquals(message,messageUtil.printMessage());
        message = "New Word";
        assertEquals(message,messageUtil.printMessage());
    }
}