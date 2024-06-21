package junitdemoproject;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ 
	JunitDemo.class, 
	MathematicsTest.class, 
	TestMethods1.class, 
	TestMethods2.class })
public class AllTests {

}
