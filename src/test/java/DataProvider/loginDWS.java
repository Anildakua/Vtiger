package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginDWS {
	@DataProvider(name = "data")
	public Object[][] sender() throws EncryptedDocumentException, IOException
	 {
		Object[][] obj=new Object[2][2];
		obj[0][0]="admin01@gmail.com";
		obj[0][1]="admin01";
		obj[1][0]="admin02@gmail.com";
		obj[1][1]="admin02";
		return obj;
	 }

	@Test(dataProvider = "data")
	public void reciver(String data1,String data2) 
	 {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(data1);
	    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(data2);
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
	    driver.close();
	    
		
	 }
	
}
