package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	//constructor
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css= "input[name='email']")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(name= "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(css= ".landing-page-button")
	@CacheLookup
	WebElement btnLogin;

	public void setUsername(String email) {
		txtEmail.sendKeys(email);
	}
	public void setPassword(String password) {
		txtPassword.sendKeys(password);

	}
	public void clickLoginButton() {
		btnLogin.click();
	}


}
