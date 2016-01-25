package com.core;

import com.core.TestJunit2;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner2 {
    public static void main(String[]args){

        Result result = JUnitCore.runClasses(TestJunit2.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

/* Console:
No of Test Case = 1
Test Case Name = testAdd
Updated Test Case Name = testNewAdd
true
 */