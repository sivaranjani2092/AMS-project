package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddlocationbygooglesearchPage {

	public WebDriver driver;

	//constructor
	public AddlocationbygooglesearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Search your address'] ")
	@CacheLookup
	WebElement searchBox;
	
	@FindBy(xpath = "//*[@id=\"location-map\"]/div/div[3]/div[1]/div[1]/input")
	@CacheLookup
	WebElement Name_txt;
	
	@FindBy(xpath = "//*[@id=\"location-map\"]/div/div[3]/div[1]/div[2]/input")
	@CacheLookup
	WebElement Abbrevation_txt;
	
	
	public void clickSearchBox(String address) {
		searchBox.sendKeys(address);
	    searchBox.sendKeys(Keys.ENTER);
	   
	}
	public void SetName(String name) {
		
		 Name_txt.sendKeys(name);

	}
	public void Setabbrevation(String addrevation) {
      Abbrevation_txt.sendKeys(addrevation);
	
	}
}