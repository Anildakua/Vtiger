package Listeners;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {

	public static void main() throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\anild\\Downloads\\dws register.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("Sheet1");
	String fName =sheet.getRow(0).getCell(0).toString();
	String lName =sheet.getRow(0).getCell(1).toString();
	}
	
}
