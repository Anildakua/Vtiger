package extantreports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginfunctionWithCredential {
@Test
public void CorrectCredential() {
	//create spark reporter
	ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/loginfunction.html");
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
	ExtentTest test = report.createTest("CorrectCredential");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("admin01");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	WebElement Community_poll= driver.findElement(By.xpath("//strong[text()='Community poll']"));
	
	if (Community_poll.isDisplayed()) {
		test.log(Status.INFO, "Community_poll is displayed");
	}
	else {
		test.log(Status.INFO, "Community_poll is not displayed");
	}
}
}
