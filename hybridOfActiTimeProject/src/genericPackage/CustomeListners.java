package genericPackage;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.ITest;

public class CustomeListners extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Browser open and test will start",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TestCase executed successfully",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("Test failed due to ;"+failedMethod,true);
		failedMethodToTakeScreenShot(failedMethod);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TestCase Skipped",true);


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test Started!!",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test Finished!!",true);
	}
	

}