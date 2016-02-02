/*
Test suite means bundle a few unit test cases and run it together.
In JUnit, both @RunWith and @Suite annotation are used to run the suite test.
This tutorial will show you an example having two TestJunit1 & TestJunit2
test classes to run together using Test Suite.

Create Test Suite Class
1- Create a java class.
2- Attach @RunWith(Suite.class) Annotation with class.
3- Add reference to Junit test classes using @Suite.SuiteClasses annotation
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestJunit1.class,
        TestJunit2.class
})
public class TestSuite {
}  