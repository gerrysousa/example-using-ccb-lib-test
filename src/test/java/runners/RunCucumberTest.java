package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    // tags = "@envfile",
    features = "src/test/resources/features",
    plugin = {"com.aventstack.chaintest.plugins.ChainTestCucumberListener:", "summary"},
    glue = {"bases"})
public class RunCucumberTest {}
