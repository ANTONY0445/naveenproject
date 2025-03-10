package org.pom;

import org.basee.NaveenBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends NaveenBase {
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("(//input[@type='text'])[2]"))
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	
	
	@FindBy(xpath = "(//input[@type='password'])")
	private WebElement passward;
	
	public WebElement getPassward() {
		return passward;
	}

	@FindBy (xpath = "(//input[@type='submit'])")
	private WebElement login ;
	
	public WebElement getLogin() {
		return login;
	}

}
