package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import screenshots.Basetest;

public class listener extends Basetest implements ITestListener{

	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart-method");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess-method");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
			System.out.println(result.getMethod().getMethodName());
			try {
				screenshot(result.getMethod().getMethodName()+".jpg");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped-method");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout-method");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart-method");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish-method");
	}
	

}
