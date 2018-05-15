package testNGlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases start and details are"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases success and details are"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("TestCases failed and details are"+result.getName());	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

/*1.TestNG Listeners are very important features of TestNG which allow
 * you to customized logs or report of TestNG
 */
	/*2.As the name says it listen to certain events and behave
	 * accordingly
	 */
	
	/*3.We can fully customized the logs using Listeners 
	 */
	
	
	
	
	
	
	
	
}
