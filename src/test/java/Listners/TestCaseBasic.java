package Listners ;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass;

@Listeners (com.crm.Listenersl.Basic.class)
public class TestCaseBasic extends BaseClass{

	@Test
	public void main1() {
	String Expected_result="https://demowebshop.tricentis.com/";
	String actual_result =driver.getCurrentUrl();
	assertEquals(Expected_result,actual_result);
	Reporter.log("main1", true);
	
	}
	@Test
	public void main2() {
	String Expected_result="https://demowebshop.tricentis.com";
	String actual_result =driver.getCurrentUrl();
	assertEquals(Expected_result,actual_result);
	Reporter.log("main2", true);
	
	}
}
