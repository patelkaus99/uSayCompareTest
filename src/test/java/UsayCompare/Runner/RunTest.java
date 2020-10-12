package UsayCompare.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =".",
        plugin = {"pretty", "html:target/cucumber-reports"},
       glue = {"UsayCompare.Runner","UsayCompare.Steps"},
        tags = {"@regression"}
        )
public class RunTest {
}
