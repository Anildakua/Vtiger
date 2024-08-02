package Parametarrize;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class dwsBase {

	public WebDriver driver;
	
@Parameters({"browser","Url"})
@BeforeClass
public void precodition(String browser,String Url)

 {          if (browser.equals("chrome"))
            {
	        driver=new ChromeDriver();
            }
            else if (browser.equals("Edge"))
            {
	        driver=new EdgeDriver();
            }
            else if (browser.equals("Firefox"))
            {
	        driver=new FirefoxDriver();
            }
            else
            {
            driver=new ChromeDriver();	
            }
	        
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(Url);
  }
@BeforeMethod
public void register() 
{
	
}
public void login() 
  {
	driver.findElement(By.xpath("//li/a[text()='Log in']")).click();
	
  }
@AfterMethod
public void logout() 
  {
	driver.findElement(By.xpath("//li/a[text()='Log out']")).click();
  }
@AfterClass
public void postcondition() 
  {
	driver.quit();
  }
}
