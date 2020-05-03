package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features"
		,glue ="stepDefinitions" , tags ="@SeleniumTest1"
		,plugin= {"pretty", "html:target/cucumber", "junit:target/cukes.xml"}
		,monochrome=true
		,strict=true
		)

//mvn test -Dcucumber.options="--tags @SeleniumTest1"
public class TestRunner {

}
