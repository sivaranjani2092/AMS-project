package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddLocationPage {

	public WebDriver driver;

	//constructor
	public AddLocationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	By Location_icon = By.xpath("//*[@id=\"menuList\"]/li[2]/a[1]");

	By addlocation_btn = By.xpath("//button[@type='button']");
	
	By Name_txt = By.xpath("//*[@id=\"location-map\"]/div/div[3]/div[1]/div[1]/input");

	By Abbrevation_txt =By.xpath("//*[@id=\"location-map\"]/div/div[3]/div[1]/div[2]/input");

	By City_txt =By.xpath("//*[@id=\"location-map\"]/div[1]/div[3]/div[3]/div[1]/input[1]");

	By State_txt =By.xpath("//*[@id=\"location-map\"]/div/div[3]/div[4]/div[1]/input");

	By Zip_txt =By.xpath("//*[@id=\"location-map\"]/div/div[3]/div[3]/div[2]/input");

	By Country_txt =By.xpath("//*[@id=\"location-map\"]/div/div[3]/div[4]/div[2]/input");

	By Address_txt = By.xpath("//*[@id=\"location-map\"]/div/div[3]/div[6]/div/textarea");

	By submit_addlocation_btn= By.cssSelector(".col-md-3");

	//Action methods

	public String getpageTitle()
	{
		return driver.getTitle();
	}

	public void ClicklocationIcon() {
		driver.findElement(Location_icon).click();

	}
	public void ClickAddlocationbtn() {
		driver.findElement(addlocation_btn).click();

	}
	public void SetName(String name) {
	
		driver.findElement(Name_txt).sendKeys(name);

	}
	public void Setabbrevation(String addrevation) {
		driver.findElement(Abbrevation_txt).sendKeys(addrevation);

	}
	public void SetCity_txt(String city) {
		driver.findElement(City_txt).sendKeys(city);

	}

	public void SetState_txt(String state ) {
		driver.findElement(State_txt).sendKeys(state);

	}
	public void SetZip_txt(String zip) {
		driver.findElement(Zip_txt).sendKeys(zip);

	}

	public void SetCountry_txt(String Country) {
		driver.findElement(Country_txt).sendKeys(Country);

	}
	public void SetAddress_txt(String Address) {
		driver.findElement(Address_txt).sendKeys(Address);

	}
	public void Submit_Addlocation_btn() {
		driver.findElement(submit_addlocation_btn).click();

	}
}