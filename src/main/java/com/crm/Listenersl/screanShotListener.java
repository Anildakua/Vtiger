package com.crm.Listenersl;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseClass.dwsScreenShort;

public class screanShotListener  extends dwsScreenShort implements ITestListener {
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
		test.log(Status.FAIL,"is failure");
		TakesScreenshot ts =(TakesScreenshot) driver;
		String screenshot=ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshot);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String t_name = result.getMethod().getMethodName();
		test.log(Status.SKIP,"is Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		spark=new ExtentSparkReporter("./Reports/failedCase.html");
		spark.config().setDocumentTitle("Screnshort");
		spark.config().setReportName("anil");
		spark.config().setTheme(Theme.DARK);
		report=new ExtentReports();
		report.setSystemInfo("Os", "Window-11");
		report.setSystemInfo("Browser", "Chrome-100");
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	
}
