package testSU.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format= {"pretty","html:report.html",
        "json:target/cucumber-reports/CucumberTestReport.json"},
		plugin = {"json:target/cucumber-reports/CucumberTestReport.json"},
		features="src/test/java/testSU/features/testHomePage.feature",
		glue= {"testSU.stepDefinition"},
		tags= {"@testSU"}
			)
public class TestRunner {

	public TestRunner() {
		
	}
}
