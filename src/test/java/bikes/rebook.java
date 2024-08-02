package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class rebook 
{
	@Test(groups = "smoke")
    public void shoes() 
    {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://reebok.abfrl.in/");
		driver.close();
    }
	@Test(groups = "functional")
	public void bat() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricketershop.com/categories/cricket-bats/reebok-cricket-bats/");
		driver.close();	
	}
}
