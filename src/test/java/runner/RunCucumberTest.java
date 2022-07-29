package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html"},
				glue="steps",
				features = "src/test/resources/Features"
				)
public class RunCucumberTest {

}
