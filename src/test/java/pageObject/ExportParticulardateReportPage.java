package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportParticulardateReportPage
{
	public WebDriver driver;

	//constructor
	public ExportParticulardateReportPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//input[@*=\"form-control custom-date-picker react-datepicker-ignore-onclickoutside\"]")
	@CacheLookup
	WebElement StarDate;

	@FindBy(css= "//input[@*=\"form-control custom-date-picker\"]")
	@CacheLookup
	WebElement EndDate;
	
	@FindBy(css= "div#root > div:nth-of-type(3) > div > div > div > div > div > div:nth-of-type(2) > button")
	@CacheLookup
	WebElement btnExportcsv;

	public void ClickCalendarStartDate() {
		StarDate.click();

	}
	public void ClickCalendarEndDate() {
		EndDate.click();
	}
	public void ClickExportbutton(){
		btnExportcsv.click();
	}
}



