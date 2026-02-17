package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features_AE",
		glue= {"stepDefinations","hooks"},
		plugin= {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
//				"html:target/cucumberReports/cr.html",
//				"json:target/cucumberReports/cr.json",
//				"junit:target/cucumberReports/cr.xml"
			
				}
//		,dryRun = true
		)
public class TestRunner {

}
