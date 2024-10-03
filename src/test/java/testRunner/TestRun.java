package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/resources/Features",
		glue= {"stepDefinitions"},
		//dryRun=true,//it will check every feature contains steps def or not
		monochrome=true,//it will remove the unnecessary char in your console window

		plugin = {
				"pretty",
				"html:target/HTMLReports/reports.html",
				"junit:target/JunitReports/reports.xml",
				"json:target/JSONReports/reports.json",	}	    

		)
public class TestRun {

}