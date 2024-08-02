package Listeners;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NetworkFaile {
		@Test(retryAnalyzer = com.crm.Listenersl.RetryNetwork.class)
		public void executeOneMoreTime() {
			String expected = "https://demowebshop.tricentis.com";
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    driver.get("https://demowebshop.tricentis.com/");
		    String actual =driver.getCurrentUrl();
		    assertEquals(expected, actual);
		    
	}

}