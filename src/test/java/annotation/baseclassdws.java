package annotation;

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

import com.beust.jcommander.Parameter;

public class baseclassdws {
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
public void login() 
  {
	
  }
@AfterMethod
public void logout() 
  {
	driver.quit();
  }
@AfterClass
public void postcondition() 
  {
	
  }
}
