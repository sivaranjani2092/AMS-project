package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchEmployeePage {
	
	public WebDriver driver;

	//constructor
	public SearchEmployeePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup 
	WebElement searchBtn;

	@FindBy(xpath= "//*[@id=\"root\"]/div[3]/div[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath= "//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/svg")
	@CacheLookup
	WebElement searchicon;



	public void clickSearchBox() {
		searchBtn.click();
	}
	public void setEmail(String email) {
		 txtEmail.clear(); // Clear the input field before sending keys
	        txtEmail.sendKeys(email + Keys.RETURN);
	        
	}
	// Method to check if search results are displayed
    public boolean isSearchResultDisplayed() {
        try {
            // Replace with the actual locator for the search result element
            WebElement resultElement = driver.findElement(By.xpath("//*[@id=\"cell-1-4\"]"));
            return resultElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false; // Return false if the element is not found
        }
    
}
}
