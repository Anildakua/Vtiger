package Assertion;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.asm.MemberSubstitution.Current;
public class softAssertion {
		@Test
		public void main() throws InterruptedException {
			String expected_url="https://demowebshop.tricentis.com/";
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			driver.get("https://demowebshop.tricentis.com/");
			String Actual_url=driver.getCurrentUrl();
			SoftAssert soft=new SoftAssert();
			soft.assertEquals(expected_url, Actual_url,"url is not matching");
			WebElement search = driver.findElement(By.id("small-searchterms"));
			search.sendKeys("laptop",Keys.ENTER);
			Thread.sleep(2000);
			WebElement advance = driver.findElement(By.id("As"));
			advance.click();
			Thread.sleep(2000);
			soft.assertNotNull(advance.isSelected(),"Element is not selected");
			driver.findElement(By.id("Isc")).click();
			Thread.sleep(2000);
			driver.close();
		}		
}
