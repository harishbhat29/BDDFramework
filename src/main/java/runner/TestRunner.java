package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\hchikalabettu\\workspace\\BDDFramework\\src\\main\\java\\feature", //path of feature files
		glue={"stepDefinition"}, //path of step definition files
		format= {"pretty","html:test-output"},
		monochrome = true,
		dryRun = true
		)

public class TestRunner {

}
