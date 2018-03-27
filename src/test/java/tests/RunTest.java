package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
				plugin = {"pretty:STDOUT","html:Reports/cucumber-pretty", "json:Reports/cucumber-json/cucumberReport.json",
						"com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumber-extent/report.html",
						"usage:Reports/cucumber-json/cucumberReport-usage.json", "junit:Reports/cucumber-results.xml"},
				features = "src/test/resources/features",
				glue = "stepdefinitions",
				dryRun = false,
				tags="@smoke"
				) 
public class RunTest {
	
}
