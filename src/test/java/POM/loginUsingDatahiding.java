package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginUsingDatahiding {
	@Test
	public void main() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://demowebshop.tricentis.com/");
	dwsPOM ref=new dwsPOM(driver);
	
	ref.login_link();
	ref.Email("admin01@gmail.com");
	ref.Password("admin01");
	ref.checkbox();
	ref.login();
	
	driver.close();
 }
}
