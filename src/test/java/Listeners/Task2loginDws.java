package Listeners;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.dwsPOM;

@Listeners(com.crm.Listenersl.Basic.class)
public class Task2loginDws extends dwsBaseListeners{

	@DataProvider(name = "Credential")
	public Object[][] sender() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\anild\\Downloads\\login DWS.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Sheet1");
		int row = sh.getPhysicalNumberOfRows();
		int col = sh.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] obj = new Object[row][col];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				obj[i][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		
		return obj;
	}
	
	@Test(dataProvider = "Credential")
	public void login(String email,String password)
	{
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/");
		dwsPOM login=new dwsPOM(driver);
		login.login_link();
		login.Email(email);
		login.Password(password);
		login.login();
	}
}

