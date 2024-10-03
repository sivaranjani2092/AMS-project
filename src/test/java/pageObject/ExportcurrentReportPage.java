package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportcurrentReportPage
{
	public WebDriver driver;

	//constructor
	public ExportcurrentReportPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "/html/body/div/div[1]/div[2]/ul/li[4]/a/img")
	@CacheLookup
	WebElement IconReport;

	@FindBy(css= "div#root > div:nth-of-type(3) > div > div > div > div > div > div:nth-of-type(2) > button")
	@CacheLookup
	WebElement btnExportcsv;

	public void ClickReportbutton() {
		IconReport.click();

	}
	public void ClickExportbutton() {
		btnExportcsv.click();
	}

	


}