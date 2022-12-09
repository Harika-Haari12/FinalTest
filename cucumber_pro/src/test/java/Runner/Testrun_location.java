package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\Features\\Login_page.feature",
		glue="Location_stepDefinition",
		dryRun=false,
		monochrome=true
		)

public class Testrun_location {

}
