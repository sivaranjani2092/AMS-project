package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddEmployeePage {

	public WebDriver driver;

	//constructor
	public AddEmployeePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath= "//*[@id=\"menuList\"]/li[3]/a[1]")
	@CacheLookup
	WebElement emplyeeicon;

	@FindBy(xpath= "//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement btnAddemplyee;

	@FindBy(xpath= "//input[@placeholder='First Name']")
	@CacheLookup
	WebElement txtFirstName;
	
	@FindBy(xpath= "//input[@placeholder='Last Name']")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(xpath= "//input[@placeholder='Email']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath= "//input[@placeholder='Employee ID']")
	@CacheLookup
	WebElement Empid;
	
	@FindBy(xpath= "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement PhoneNumber;
	
	@FindBy(xpath= "//*[@id=\"root\"]/div[3]/div/div[2]/div/div[6]/div/div/div/div[2]/div")
	@CacheLookup
	WebElement Company;
	
	@FindBy(xpath= "//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[1]/div[7]/button[2]")
	//@FindBy(xpath= "/html/body/div/div[3]/div/div[2]/div/div[7]/button[2]")

	@CacheLookup
	WebElement btnAdd;
	
	public void ClickEmployeeIcon() {
		emplyeeicon.click();

	}
	public void ClickAddlocationbtn() {
		btnAddemplyee.click();

	}
	public void SetFirstName(String Firstname) {
	
		txtFirstName.sendKeys(Firstname);

	}
	public void SetLastname(String Lastname) {
		txtLastName.sendKeys(Lastname);

	}
	public void Setemail(String email) {
		txtEmail.sendKeys(email);

	}
	
	public void Setempid(String empid) {
		Empid.sendKeys(empid);

	}
	public void Setphonenumber(String phonenumber) {
		PhoneNumber.sendKeys(phonenumber);

	}
	public void Setcompany() {
		Company.click();

	}
	public void ClickAddButton() {
		btnAdd.click();

	}
}
