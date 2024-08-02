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
public class loginDWSbyUsingExcelDyanamicaly {
			@DataProvider(name = "data")
			public Object[][] sender() throws EncryptedDocumentException, IOException
			 {
				
				FileInputStream fis=new FileInputStream("C:\\Users\\anild\\OneDrive\\Desktop\\login DWS.xlsx");
				Workbook wb= WorkbookFactory.create(fis);
			    Sheet sheet = wb.getSheet("Sheet1");
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
				driver.get("https://demowebshop.tricentis.com/");
			    driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
			    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(data1);
			    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(data2);
			    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			    driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
			    driver.close();
			    
				
			 }
			
}
