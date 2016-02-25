package com.vogella.junit.first;

public class MyClass {
    public int multiply(int x, int y) {

        if (x > 999) {
            throw new IllegalArgumentException("X should be less than 1000");
        }
        //return x / y;               //2 test done: 1 failed

        /* via TestRunner:
        testMultiply(com.vogella.junit.first.test.MyClassTest): 10 x 5 must be 50 expected:<50> but was:<2>
        false
         */

        return x * y;            //all 2 tests passed

         /* via TestRunner:
            true
         */
    }
}

