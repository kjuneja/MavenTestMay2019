package practicemaven.TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNG {
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("You are in Before Test");
	}
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("Before Method");
	}	
	@Test(priority=0)
	public void testMehtod1() {
		System.out.println("This is my first testNG method1");
	}
	@Test(priority=1)
	public void testMethod2() {
		System.out.println("This is my first testNG method2");
	}
	@AfterTest
	public void afterTestMethod() {
		System.out.println("You are in After Test");
	}
	@AfterClass
	public void testAfterClass() {
		System.out.println("After Class");
	}
	@AfterMethod
	public void testAfterMethod() {
		System.out.println("After Mehtod");
	}
	
	
	//BeforeSuite and AfterSuite
	//group the test cases --smoke test, regression test
	//disable some test cases
	
	//testNG.xml
	
	//listeners in testNG -- listeners and interfaces from the testNG library and it lets us modify the behaviour in testNG

}
