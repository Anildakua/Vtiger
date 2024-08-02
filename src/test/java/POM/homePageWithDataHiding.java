package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class homePageWithDataHiding {
	
	@Test
	public void main() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://demowebshop.tricentis.com/");
	
	dwsHomePagePOM ref=new dwsHomePagePOM(driver);
	
	
	
	}
}
