package BaseClass;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class dwsScreenShort {
    public static WebDriver driver;
	@BeforeClass
	public void preCodition() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Account is created...",true);
	}
	@BeforeMethod
	public void beforMethod() {
	    Reporter.log("welcome to dws",true);	
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Thanks you for the visit",true);	
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
