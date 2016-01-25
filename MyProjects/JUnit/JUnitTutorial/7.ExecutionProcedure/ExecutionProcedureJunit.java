/* See the above output and this is how the JUnit execution procedure is.
* 1- First of all beforeClass() method execute only once
* 2- Lastly, the afterClass() method executes only once.
* 3- before() method executes for each test case but before executing the test case.
* 4- after() method executes for each test case but after the execution of test case
* 5- In between before() and after() each test case executes.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ExecutionProcedureJunit {
    //execute only once, in the starting
    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    //execute only once, in the end
    @AfterClass
    public static void  afterClass() {
        System.out.println("in after class");
    }

    //execute for each test, before executing test
    @Before
    public void before() {
        System.out.println("in before");
    }

    //execute for each test, after executing test
    @After
    public void after() {
        System.out.println("in after");
    }

    //test case 1
    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    //test case 2
    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }
}
