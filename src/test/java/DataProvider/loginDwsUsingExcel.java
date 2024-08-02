package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginDwsUsingExcel {
		@DataProvider(name = "data")
		public Object[][] sender() throws EncryptedDocumentException, IOException
		 {
			Object[][] obj=new Object[2][2];
			FileInputStream fis=new FileInputStream("C:\\Users\\anild\\OneDrive\\Desktop\\login DWS.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
		    Sheet sheet = wb.getSheet("Sheet1");
			obj[0][0]=sheet.getRow(0).getCell(0).toString();
			obj[0][1]=sheet.getRow(0).getCell(1).toString();
			obj[1][0]=sheet.getRow(1).getCell(0).toString();
			obj[1][1]=sheet.getRow(1).getCell(1).toString();
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