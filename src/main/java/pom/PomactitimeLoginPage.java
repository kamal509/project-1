package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.Page;

public class PomactitimeLoginPage 

{
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTextfield;
	
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotYourPasswordLink;
	
	public PomactitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void loginMethod()
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepLoggedInCheckBox.click();
		loginButton.click();
	}
	
	public void forgotPasswordMethod()
	{
		forgotYourPasswordLink.click();
	}

}
