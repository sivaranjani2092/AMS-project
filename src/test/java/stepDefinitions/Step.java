package stepDefinitions;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AddEmployeePage;
import pageObject.AddLocationPage;
import pageObject.AddlocationbygooglesearchPage;
import pageObject.ExportParticulardateReportPage;
import pageObject.ExportcurrentReportPage;
import pageObject.LoginPage;
import pageObject.SearchEmployeePage;
import org.openqa.selenium.JavascriptExecutor;

public class Step extends BaseClass
{

	public void clickUsingJavaScript(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

	@Given("Open the browser and enter the url {string}")
	public void open_the_browser_and_enter_the_url(String string) {

		System.setProperty("webdriver.chrome.driver","C:/Users/Sequoia/eclipse-workspace/AMS-Sequoiat/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		// Navigate to the specified URL
		driver.get(string);
		driver.manage().window().maximize();    

		// Initialize page objects
		lp = new LoginPage(driver);
		addLoc = new AddLocationPage(driver);
		addEmp = new AddEmployeePage(driver);
		findEmp = new SearchEmployeePage(driver);  
		exportCSV =new ExportcurrentReportPage(driver);
		searchReport = new ExportParticulardateReportPage(driver);
		searchBox = new AddlocationbygooglesearchPage(driver);
	}

	@Given("Enter the email id as {string}")
	public void enter_the_email_id_as (String email) {
		lp.setUsername(email);

	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
		lp.setPassword(password);
	}

	@Then("Click on the login button")
	public void click_on_the_login_in_button() {
		lp.clickLoginButton();

	}

	@And("I should be redirected to the home page {string}")
	public void i_should_be_redirected_to_the_home_page(String expectedUrl) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.urlToBe("https://dev-atndnz.offrd.co/home"));

		// Retrieve the current URL
		String currentUrl = driver.getCurrentUrl();

		// Assert that the current URL matches the expected URL
		Assert.assertEquals("The current URL did not match the expected URL.", expectedUrl, currentUrl);

	}

	//Add location method step definitions -------

	@Then("Click on the location icon")
	public void click_on_the_location_icon() throws InterruptedException {
		Thread.sleep(1000);
		addLoc.ClicklocationIcon();
		System.out.println("Expected Message:Location icon is clicked ");
	}

	//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	//		wait.until(ExpectedConditions.urlToBe("https://dev-ams.sequoiaat.com/location"));
	//
	//		// Retrieve the current URL
	//		String currentUrl = driver.getCurrentUrl();
	//
	//		// Assert that the current URL matches the expected URL
	//		Assert.assertEquals("The current URL did not match the expected URL.", expectedUrl, currentUrl);
	//		
	//		Assert.assertEquals("Atndnz Portal", addLoc.getpageTitle());
	//		// Fetch and trim the actual title
	//	    String actualTitle = addLoc.getpageTitle().trim();
	//	    String expectedTitle = "Atndnz Portal".trim();  // Ensure there are no extra spaces
	//		 // Debug output (if needed)
	//	    System.out.println("Expected Title: [" + expectedTitle + "]");
	//	    System.out.println("Actual Title: [" + actualTitle + "]");
	//	

	@Then("Click on the add location button")
	public void click_on_the_add_location_button() throws InterruptedException {
		Thread.sleep(1000);
		addLoc.ClickAddlocationbtn();

	}

	@When("Enter the name, abbervation ,city, state,pincode, country and address")
	public void enter_the_name_abbervation_city_state_pincode_country_and_address() throws InterruptedException {
		Thread.sleep(1000);
		addLoc.SetName("Chennai");
		addLoc.Setabbrevation("JD");
		addLoc.SetCity_txt("kY");
		addLoc.SetZip_txt("50005");
		addLoc.SetState_txt("New york");
		addLoc.SetCountry_txt("US");
		addLoc.SetAddress_txt("123,ABC street");

	}

	@Then("Click on the add location button to create a new location")
	public void click_on_the_add_location_button_to_create_a_new_location() throws InterruptedException {
		addLoc.Submit_Addlocation_btn();
		Thread.sleep(2000);
	}

	@Then("User can view confirmation alter message {string}")
	public void user_can_view_confirmation_alter_message(String expectedMessage) {

		// Locate the confirmation message element
		WebElement confirmationMessageElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]"));
		String actualMessage=confirmationMessageElement.getText().trim();
		String expectedText = "Location added successfully".trim();

		// Debugging output
		System.out.println("Actual Message: '" + actualMessage + "'");
		System.out.println("Expected Message: '" + expectedText + "'");
		// Assert that the messages match
		Assert.assertEquals("Confirmation message does not match", expectedText, actualMessage);

	}
	//Add employee method step definitions-----------------

	@Given("Click on the employee icon")
	public void click_on_the_employee_icon() {
		addEmp.ClickEmployeeIcon();
	}

	@When("Click on the Add employee button")
	public void click_on_the_add_employee_button() {
		addEmp.ClickAddlocationbtn();
	}

	@Then("Enter the {string}, {string},{string},{string},{string}")
	public void enter_the(String FirstName, String LastName, String EmailId, String employeeId, String PhoneNumber) {
		addEmp.SetFirstName(FirstName);
		addEmp.SetLastname(LastName);
		addEmp.Setemail(EmailId);
		addEmp.Setempid(employeeId);
		addEmp.Setphonenumber(PhoneNumber);
	}

	@Then("Select the company")
	public void select_the_company() throws InterruptedException {
		Thread.sleep(2000);
		addEmp.Setcompany();


	}

	@Then("Click on the Add button {string}")
	public void click_on_the_add_button(String expectedMessage) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Wait<WebDriver> fluentWait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);

		fluentWait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				try {
					WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div[1]/div[7]/button[2]"));
					if (button.isDisplayed() && button.isEnabled()) {
						clickUsingJavaScript(button);
						return true; // Click was successful
					}
				} catch (ElementClickInterceptedException e) {
					System.out.println("Element click was intercepted: " + e.getMessage());
				}
				return false; // Retry the click
			}
		});

		try {
			// Wait for the confirmation message element to be visible
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
			WebElement confirmationMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[4]")));

			// Retrieve the text of the confirmation message
			String actualMessage = confirmationMessageElement.getText().trim();

			// Debugging output to check the actual HTML content if the message is empty
			if (actualMessage.isEmpty()) {
				System.out.println("Confirmation message is empty. Current HTML content:");
				System.out.println(confirmationMessageElement.getAttribute("outerHTML"));
			}

			// Debugging output
			System.out.println("Actual Message: '" + actualMessage + "'");
			System.out.println("Expected Message: '" + "Employee already registered".trim() + "'");


			// Check for multiple conditions
			if (actualMessage.equals("New employee added")) {
				Assert.assertEquals("Confirmation message does not match", "Employee added sucessfuly", actualMessage);
			} else if (actualMessage.equals("Employee ID already exists")) {
				Assert.assertEquals("Confirmation message does not match", "Employee ID already exists", actualMessage);
			} else if (actualMessage.equals("Employee already registered")) {
				Assert.assertEquals("Confirmation message does not match", "Employee already registered", actualMessage);
			} else {
				Assert.fail("Unexpected confirmation message: " + actualMessage);
			}
		} catch (NoSuchElementException e) {
			System.out.println("Confirmation message not found: " + e.getMessage());
			Assert.fail("Confirmation message not found.");
		} catch (TimeoutException e) {
			System.out.println("Timeout waiting for confirmation message: " + e.getMessage());
			Assert.fail("Confirmation message not found within the timeout period.");
		}
	}



	//Steps for search employee methods using email id (step definitions)----

	@Given("Click on the search box and enter the {string}")
	public void click_on_the_search_box_and_enter_the_email_id(String email) {
		findEmp.clickSearchBox();
		findEmp.setEmail(email);
	}

	@When("User should found search result of the particular employee")
	public void user_should_found_search_result_of_the_particulaar_employee() throws InterruptedException {
		findEmp.clickSearchBox();
		Thread.sleep(2000);

		// Check if the search result is displayed
		boolean isResultDisplayed = findEmp.isSearchResultDisplayed(); // Call the method to check for search result

		// Return a message indicating the result
		if (isResultDisplayed) {
			System.out.println("Search result is found.");
		} else {
			System.out.println("Search result is not found.");
		}

		// Assert that the search result is displayed
		Assert.assertTrue("Search result is not displayed.", isResultDisplayed);

	}
	@And("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}
	// Add ExportcurrentReport method step definitions


	@When("Click on the report button")
	public void click_on_the_report_button() {
		exportCSV.ClickReportbutton();

	}

	@When("Click on the export button and get the current report of the month")
	public void click_on_the_export_button_and_get_the_current_report_of_the_month() {

		exportCSV.ClickExportbutton();
		// Define the file name (adjust as needed)
		String fileName = "attendance_records.csv"; // Change to your actual expected file name
		File file = new File("C:/Users/Sequoia/Downloads/" + File.separator + fileName);

		// Wait for the file to download
		boolean isDownloaded = waitForFileToDownload(file, 30);

		// Return a message based on the download status
		if (isDownloaded) {
			System.out.println("File downloaded successfully: " + file.getAbsolutePath());
		} else {
			System.out.println("File download failed or timed out.");
		}
	}

	private boolean waitForFileToDownload(File file, int timeoutInSeconds) {
		int timeElapsed = 0;
		while (timeElapsed < timeoutInSeconds) {
			if (file.exists()) {
				return true; 
			}
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			timeElapsed++;
		}
		return false; 
	}

	//---Add ExportparticulardataExport employee methods using email id (step definitions)-
	@When("Click on the start date and")
	public void click_on_the_start_date() {
		searchReport.ClickCalendarStartDate();
	}

	@When("Click on end date")
	public void click_on_end_date() {
		searchReport.ClickCalendarEndDate();
		
	}

	@Then("Click on exportbutton and I should able to downlaod the search report of the month")
	public void Click_on_exportbutton_and_then_i_should_able_to_downlaod_the_search_report_of_the_month() {
		searchReport.ClickExportbutton();
	}

//----Add location search by google 
	
	@Then("Click on the Search bar and enter the location {string}")
	public void click_on_the_search_bar_and_enter_the_location(String address) throws InterruptedException {
		Thread.sleep(1000);

		System.out.println("Entering address: " + address);
		searchBox.clickSearchBox(address);
		System.out.println("Waiting for suggestions...");
		Thread.sleep(2000);
		// Wait for suggestions to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

		// Wait for suggestions to be present, not necessarily visible
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[contains(@class, 'pac-item')]")));


	    // Find all suggestions
	    List<WebElement> suggestions = driver.findElements(By.xpath("//li[contains(@class, 'pac-item')]"));
	    
	    // Select the 3rd option (index 2, since it's zero-based)
	    if (suggestions.size() >= 3) {
	        suggestions.get(2).click(); // Click on the 3rd suggestion
	    } else {
	        System.out.println("Less than 3 suggestions available.");
	    }

	}

	@When("Enter the name, abbervation")
	public void enter_the_name_abbervation() {
		addLoc.SetName("Chennai");
		addLoc.Setabbrevation("JD");
	}
}







