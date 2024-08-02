package basictestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG {
	@Test(priority = 1,invocationCount = 3,threadPoolSize = 2)
	public void m1() throws InterruptedException
	{
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     Thread.sleep(2000);
     driver.close();
	}
	@Test(priority = 0,invocationCount = 3,threadPoolSize = 2)
	public void bkie1() throws InterruptedException {
		WebDriver driver2 =new ChromeDriver();
		 driver2.manage().window().maximize();
		driver2.get("https://www.bikewale.com/hero-bikes/");
		Thread.sleep(2000);
		driver2.close();
	}

}
