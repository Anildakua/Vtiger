	package DataProvider;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginShopperStack {

	
	
				@DataProvider(name = "data")
				public Object[][] sender() throws EncryptedDocumentException, IOException
				 {
					
					FileInputStream fis=new FileInputStream("E:\\New folder (2)\\Shopper login.xlsx");
					Workbook wb= WorkbookFactory.create(fis);
				    Sheet sheet = wb.getSheet("Sheet");
				    int row =sheet.getPhysicalNumberOfRows();
				    int colom =sheet.getRow(0).getPhysicalNumberOfCells();
				    Object[][] obj=new Object[row][colom];    
				    
				    for (int i = 0; i <row; i++)
				    {
				    	for (int j = 0; j <colom; j++)
				    	{
						obj[i][j]=sheet.getRow(i).getCell(j).toString();	
						}
						
					}
				
					return obj;
				 }

				@Test(dataProvider = "data")
				public void reciver(String data1,String data2) 
				 {
					ChromeDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
					driver.get("https://www.shoppersstack.com/");
				    driver.findElement(By.xpath("//button[text()='Login']")).click();
				    driver.findElement(By.id("Email")).sendKeys(data1);
				    driver.findElement(By.id("Password")).sendKeys(data2);
				    driver.findElement(By.linkText("Login")).click();
				    
				    driver.close();
				    
					
				 }
				
	}

