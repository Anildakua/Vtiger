package Listeners;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.dwsRegister;
import bsh.BshClassManager.Listener;

@Listeners(com.crm.Listenersl.Basic.class)


public class task1DwsLogin extends dwsBaseListeners {
	
	@Test
	public void register() {

			ExcelUtility eUtil=new ExcelUtility();
		
				int row = 0;
				assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/");
				Register reg = new Register(driver);
				reg.register();
				reg.genderM();
				reg.firstName(eUtil.getData("DWS_R", row++, 0));
				reg.lastName(eUtil.getData("DWS_R", row++, 0));
				reg.email(eUtil.getData("DWS_R", row++, 0));
				reg.pass(eUtil.getData("DWS_R", row++, 0));
				reg.confirmPassword(eUtil.getData("DWS_R", row++, 0));
				reg.registerBtn();
				
			}
		}
	    
	}

}
//Register reg = new Register(driver);
//reg.register();
//reg.genderM();
//reg.firstName(eUtil.getData("DWS_R", row++, 0));
//reg.lastName(eUtil.getData("DWS_R", row++, 0));
//reg.email(eUtil.getData("DWS_R", row++, 0));
//reg.pass(eUtil.getData("DWS_R", row++, 0));
//reg.confirmPassword(eUtil.getData("DWS_R", row++, 0));
//reg.registerBtn();
