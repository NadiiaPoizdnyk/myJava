package com.core;

import com.core.TestJunit3;
import com.core.TestJunit1;
import com.core.TestJunit2;
import junit.framework.*;

public class JunitTestSuite {
    public static void main(String[]args){

        // add the test's in the suite
        TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class);
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("Number of test cases = " + result.runCount());
    }
}

/* Console:
No of Test Case = 1
Test Case Name = testAdd
Updated Test Case Name = testNewAdd
Number of test cases = 3
 */