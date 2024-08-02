package extantreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class samplereport {
@Test
public void basicReport() {
	//create spark reporter
	ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/sampleReport.html");
	//configure the spark reporter
	spark.config().setDocumentTitle("samplereport");
	spark.config().setReportName("anil");
	spark.config().setTheme(Theme.DARK);
	//create the extent report
	ExtentReports report=new ExtentReports();
	//configure extent report
	report.setSystemInfo("Os", "Window-11");
	report.setSystemInfo("Browser", "Chrome-100");
	//attach the spark reporter to the extent report
	report.attachReporter(spark);
	ExtentTest test = report.createTest("basicReport");
	test.log(Status.INFO,"report is successfully created");
	report.flush();
	
}
}
