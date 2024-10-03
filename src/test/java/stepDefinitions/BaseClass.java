package stepDefinitions;


import pageObject.AddEmployeePage;
import pageObject.AddLocationPage;
import pageObject.AddlocationbygooglesearchPage;
import pageObject.ExportParticulardateReportPage;
import pageObject.ExportcurrentReportPage;
import pageObject.LoginPage;
import pageObject.SearchEmployeePage;

//import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver; 


public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public AddLocationPage addLoc; 
	public AddEmployeePage addEmp;
	public SearchEmployeePage findEmp;
	public ExportcurrentReportPage exportCSV;
	public ExportParticulardateReportPage searchReport;
	public AddlocationbygooglesearchPage searchBox;
	

	
	//System.setProperty("webdriver.chrome.driver","C:/Users/Sequoia/eclipse-workspace/AMS-Sequoiat/src/test/resources/Driver/chromedriver.exe");
	//driver=new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver","C:/Users/Sequoia/eclipse-workspace/AMS-Sequoiat/src/test/resources/Driver/geckodriver.exe");
	//driver=new FirefoxDriver();
    
    
//	///Create for generate random string for unique email 
//	public static String randomestring() {
//		String generatedString = RandomStringUtils.randomAlphabetic(5);
//		return (generatedString);
//		
//	}
//	
}
