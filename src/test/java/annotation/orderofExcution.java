package annotation;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class orderofExcution extends baseclassdws
{
 @Test
 public void elementclick() throws InterruptedException
 {
	    String Url=("https://demowebshop.tricentis.com/news/rss/1");
	 
	    Actions act=new Actions(driver);
	    act.keyDown(Keys.PAGE_DOWN).build().perform();
	    act.keyDown(Keys.PAGE_DOWN).build().perform();
	  List<WebElement> links= driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
	    for (WebElement web : links)
	    {
	    	String curentUrl = driver.getCurrentUrl();
	    	if (Url.equals(curentUrl))
	    	{
			driver.navigate().back();	
			}
			web.click();
			Thread.sleep(2000);
		}
	    
 }
}
