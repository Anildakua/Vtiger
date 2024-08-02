package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logindws {
	
	@Test
	public void main() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://demowebshop.tricentis.com/");
	dwsPOM ref=new dwsPOM(driver);
	
	//when  dwsPOM class method is in public that time its work
	ref.login_link.click();
	ref.Email.sendKeys("admin01@gmail.com");
	ref.Password.sendKeys("admin01");
	ref.checkbox.click();
	ref.login.click();
	
	driver.close();
	}
}
