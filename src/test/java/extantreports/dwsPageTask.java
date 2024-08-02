package extantreports;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Listenersl.DwsBaseListeners;

import POM.DWS_DigitalDownload;
import POM.DWS_HomePage;
import POM.dwsGiftCard;

@Listeners(com.crm.Listenersl.ReportWithMutipalTestcase.class)
public class dwsPageTask extends DwsBaseListeners {
	
@Test(priority = 4)
public void facebookRegister() throws InterruptedException {
	String Expected_result="https://demowebshop.tricentis.com/";
	String actual_result =driver.getCurrentUrl();
	assertEquals(Expected_result,actual_result);
	Actions scroll=new Actions(driver);
	scroll.keyDown(Keys.PAGE_DOWN).build().perform();
	scroll.keyDown(Keys.PAGE_DOWN).build().perform();
	driver.findElement(By.linkText("Facebook")).click();
	Thread.sleep(2000);
	Set<String> child =driver.getWindowHandles();
	System.out.println(child);
	for (String str : child) {
		
    if (driver.switchTo().window(str).getCurrentUrl().equals("https://www.facebook.com/nopCommerce")) {
    	System.out.println("get in facebook");
    	driver.findElement(By.xpath("//font[text()='Create a new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("anil");
		driver.findElement(By.name("lastname")).sendKeys("dakua");
		driver.findElement(By.name("reg_email__")).sendKeys("anildakua3@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("anil123");
		driver.findElement(By.id("day")).sendKeys("01");
		driver.findElement(By.id("month")).sendKeys("jan");
		driver.findElement(By.id("year")).sendKeys("2000");
		driver.findElement(By.name("sex")).click();
		Thread.sleep(2000);
     }
    driver.navigate().back();
    }
 }
@Test(priority = 3)
public void twitterRegister() throws InterruptedException {
	String Expected_result="https://demowebshop.tricentis.com/";
	String actual_result =driver.getCurrentUrl();
	assertEquals(Expected_result,actual_result);
	Actions scroll=new Actions(driver);
	scroll.keyDown(Keys.PAGE_DOWN).build().perform();
	scroll.keyDown(Keys.PAGE_DOWN).build().perform();
	driver.findElement(By.linkText("Twitter")).click();
	Thread.sleep(2000);
	Set<String> child =driver.getWindowHandles();
	System.out.println(child);
	for (String str : child) {
	if (driver.switchTo().window(str).getCurrentUrl().equals("https://x.com/nopCommerce")) {
		System.out.println("get in twitter");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
	 }
	driver.navigate().back();
	}
 }
@Test(priority = 0)
public void clickAllEliments() throws InterruptedException {
	String Expected_result="https://demowebshop.tricentis.com/";
	String actual_result =driver.getCurrentUrl();
	assertEquals(Expected_result,actual_result);
	
			DWS_HomePage ref= new DWS_HomePage(driver) ;
			
			ref.getNewsletter("Welcome");
			Thread.sleep(2000);
			ref.getSearchTf("watch");
			Thread.sleep(2000);
			ref.getSearchButton();
			Thread.sleep(2000);
			driver.navigate().back();
			
			List<WebElement> poll = ref.getPoll();
			for (WebElement web : poll) {
				web.click();
				Thread.sleep(2000);
				
			}
			
			List<WebElement> navBar = ref.getNavBar();
			for (WebElement web : navBar) {
				web.click();
				Thread.sleep(2000);
				driver.navigate().back();
				
			}
		}
@Test(priority = 2)
public void giftcard() throws InterruptedException {
	String Expected_result="https://demowebshop.tricentis.com/";
	String actual_result =driver.getCurrentUrl();
	assertEquals(Expected_result,actual_result);
			
			dwsGiftCard ref =new dwsGiftCard(driver);
			ref.getGift_link();
			Thread.sleep(2000);
			ref.getSort_by();
			Thread.sleep(2000);
			ref.getDisplay();
			Thread.sleep(2000);
			ref.getView();
			Thread.sleep(2000);
			
			
			List<WebElement> add = ref.getAdd_to_cart_btn();
			for (WebElement web: add) {
				web.click();
				Thread.sleep(2000);
				
			}
}
@Test(priority = 1)
public void digitalDownload() throws InterruptedException {
			String Expected_result="https://demowebshop.tricentis.com/";
			String actual_result =driver.getCurrentUrl();
			assertEquals(Expected_result,actual_result);
			
			DWS_DigitalDownload ref =new DWS_DigitalDownload(driver);
			ref.getDigiDownload();
			Thread.sleep(2000);
			ref.getSortby();
			Thread.sleep(2000);
			ref.getDisplay();
			Thread.sleep(2000);
			ref.getView();
			Thread.sleep(2000);
			
			List<WebElement> add = ref.getAddToCart();
			for (WebElement web: add) {
				web.click();
				Thread.sleep(2000);
				
			}
			
			driver.findElement(By.className("ico-cart")).click();
			
			WebElement product = driver.findElement(By.xpath("//tr[@class='cart-item-row']"));
//			if(product.isDisplayed())
//			{
//				System.out.println("Products are added to the cart");
//			}
//			else {
//				System.out.println("Not added to the cart");
//			}
			
			assertEquals(product.isDisplayed(),true);
			
			
		}	
 
}

