package Listeners;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.BaseClass;
public class testcasebase {

	@Listeners (com.crm.Listenersl.Basic.class)
	public class TestCaseBasic extends DwsBaseListeners{

		@Test
		public void main1() {
		String Expected_result="https://demowebshop.tricentis.com/";
		String actual_result =driver.getCurrentUrl();
		assertEquals(Expected_result,actual_result);
		
		}
		@Test
		public void main2() {
		String Expected_result="https://demowebshop.tricentis.com";
		String actual_result =driver.getCurrentUrl();
		assertEquals(Expected_result,actual_result);
		}
	}
}
