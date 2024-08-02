package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tvs {
		@Test(priority = 1,invocationCount = 3,threadPoolSize = 2,groups = "regression")
		public void m1() throws InterruptedException
		{
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.tvsmotor.com/");
	     Thread.sleep(2000);
	     driver.close();
		}
}
