package extantreports;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.dwsScreenShort;

@Listeners(com.crm.Listenersl.screanShotListener.class)
public class takeScreanShotOnFailesTestcase extends dwsScreenShort {
@Test
public void login() throws InterruptedException {

driver.findElement(By.linkText("Log in")).click();
driver.findElement(By.name("Email")).sendKeys("admin@gmail.com");
driver.findElement(By.name("Password")).sendKeys("worng");
Thread.sleep(2000);
driver.findElement(By.cssSelector("[value='Log in']")).click();
driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
 }
}
