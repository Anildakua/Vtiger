package com.crm.Listenersl;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportWithMutipalTestcase implements ITestListener {
    ExtentReports report;
    ExtentSparkReporter spark;
    ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		Reporter.log(t_name+"is executed");
		test=report.createTest(t_name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		test.log(Status.PASS,"is Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		test.log(Status.FAIL,"is fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		test.log(Status.SKIP,"is Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	@Override
	public void onStart(ITestContext context) {
		//create a spark report
		spark=new ExtentSparkReporter("./Reports/dwstask.html");
		//configure the spark report
		spark.config().setDocumentTitle("sampleReport");
		spark.config().setReportName("anil");
		spark.config().setTheme(Theme.DARK);
		//create the extent report
		report=new ExtentReports();
		//configure extent report
		report.setSystemInfo("Os", "Window-11");
		report.setSystemInfo("Browser", "Chrome-100");
		//attach the spark reporter to the extent report
		report.attachReporter(spark);
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
