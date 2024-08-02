package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class company {
	@Test(priority = 1,invocationCount = 2,threadPoolSize = 2,groups = "smoke")
	public void m1() throws InterruptedException
	{
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://odishatourism.gov.in/content/tourism/en.html");
     Thread.sleep(20000);
     driver.close();
	}
}
