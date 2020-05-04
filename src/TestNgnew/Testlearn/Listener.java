package Testlearn;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log(result.getName()+"is pass");//to get result of pass tC
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log(result.getName()+"is fail");//to get result of fail TC
		//below way you have to give screenshot- in general we use screenshot method
		Reporter.log("<a href =\"C:\\Users\\DSC_0701.jpg\"target=\"_blank\"> TEst case failed:</a>" + result.getName());
			Reporter.log("<br>");
Reporter.log("<a href =\"C:\\Users\\DSC_0701.jpg\"target=\"_blank\"> <img height = 200 width =200 src =\"C:\\Users\\DSC_0701.jpg\"> </img></a>" + result.getName());
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
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log(context.getName()+" Started Execution");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		Reporter.log(context.getName()+"  Execution finish");
	}
	
}
