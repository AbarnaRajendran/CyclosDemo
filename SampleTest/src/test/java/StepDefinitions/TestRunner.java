package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

 @RunWith(Cucumber.class)
 @CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"}, monochrome= true,
		 plugin = {
			        "html:target/cucumber-reports/html-report.html",  // HTML report
			        "json:target/cucumber-reports/cucumber.json",    // JSON report
			        "junit:target/cucumber-reports/cucumber.xml"     // JUnit XML report
			    })
public class TestRunner {
}
