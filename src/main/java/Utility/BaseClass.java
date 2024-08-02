package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeClass
	public void precodition()
	{
//	          if (browser.equals("chrome"))
//	            {
//		        driver=new ChromeDriver();
//	            }
//	            else if (browser.equals("Edge"))
//	            {
//		        driver=new EdgeDriver();
//	            }
//	            else if (browser.equals("Firefox"))
//	            {
//		        driver=new FirefoxDriver();
//	            }
//	            else
//	            {
//	            driver=new ChromeDriver();	
//	            }
				
	            driver = new ChromeDriver();
		        
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://demowebshop.tricentis.com/");
	  }
	@BeforeMethod
	public void login() 
	  {
		
	  }
	@AfterMethod
	public void logout() 
	  {
	  }
	@AfterClass
	public void postcondition() 
	  {
		driver.quit();
	  }
}