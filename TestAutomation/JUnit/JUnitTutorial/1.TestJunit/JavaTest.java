
import junit.framework.TestCase;
import junit.framework.*;

public class JavaTest extends TestCase {
    protected int value1, value2;

    // assigning the values
    protected void setUp(){    //setUp() method which runs before every test invocation.
        value1=3;
        value2=3;
    }

    // test method to add two values
    public void testAdd(){
        double result= value1 + value2;
        assertTrue(result == 6);
    }
}