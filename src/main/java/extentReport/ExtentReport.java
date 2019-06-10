package extentReport;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public ExtentHtmlReporter extentHtmlReporter;
	 
	public ExtentTest extentTest;
	 
	public ExtentReports extentReports;
	 
	 
	       @BeforeClass
	       public void beforeClass() {
	              extentHtmlReporter = new ExtentHtmlReporter("extent.html");
	             
	              extentReports =new ExtentReports();
	             
	              extentReports.attachReporter(extentHtmlReporter);
	              extentTest=extentReports.createTest(getClass().getSimpleName());
	             
	             
	      
	       }
	      
	       @BeforeMethod
	       public void beforeMethod(Method result) {
	              extentTest.log(Status.INFO, result.getName()+"Started..");
	             
	       }
	      
	       @Test
	       public void test1() {
	             
	              extentTest.log(Status.INFO, "test 1 started");
	              extentTest.log(Status.INFO, "test 1 started");
	       }
	      
	       @Test
	       public void test2() {
	              extentTest.log(Status.INFO, "test 2 started");
	              extentTest.log(Status.INFO, "test 2 started");
	       }
	      
	       @AfterMethod
	       public void afterMethod(ITestResult result) {
	              logReport(result);
	             
	       }
	      
	       public void logReport(ITestResult result) {
	             
	              if(result.getStatus()==result.FAILURE) {
	                     extentTest.log(Status.ERROR, result.getName()+"Failed");
	                     extentTest.log(Status.ERROR,result.getThrowable());
	              }
	             
	              else if (result.getStatus()==result.SKIP) {
	                     extentTest.log(Status.SKIP, result.getName()+"Skipped");
	                     extentTest.log(Status.SKIP,result.getThrowable());
	              }
	             
	              else if (result.getStatus()==result.SUCCESS) {
	                     extentTest.log(Status.INFO, result.getName()+"Success");
	              }
	             
	             
	       }
	      
	       @AfterTest
	       public void Afterclass() {
	             
	              extentReports.flush();
	       }
	 
}
