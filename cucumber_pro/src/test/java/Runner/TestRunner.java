package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\Features\\login_city.feature",
		glue="city_StepDefinition",
		dryRun=false,
		monochrome=true
		)

public class TestRunner {
	

}



