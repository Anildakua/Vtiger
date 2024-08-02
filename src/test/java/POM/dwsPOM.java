package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dwsPOM {

	public dwsPOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(className = "ico-login")
	WebElement login_link;
	
	private @FindBy(id = "Email")
	WebElement Email;
	
	private @FindBy(id = "Password")
	WebElement Password;
	
	private @FindBy(id = "RememberMe")
	WebElement checkbox;
	
	private @FindBy(xpath = "//input[@value='Log in']")
	WebElement login;
	
	public void login_link() {
		login_link.click();
	}
	
	public void Email(String user) {
		Email.sendKeys(user);
	}
	
	public void Password(String user) {
		Password.sendKeys(user);
	}
	
	public void checkbox() {
		checkbox.click();
	}
	 
	public void login() {
		login.click();
	}
}
