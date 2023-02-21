package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"WebStepDefinition"},
        tags = "@addCustomer or @openAccount or @deleteCustomer",
        monochrome = true,
        dryRun = false, // runs feature file so false to stop
        plugin = {
                "pretty", "html:build/reports/feature.html"
        }
)

@Test
public class XYZBankTestRunner extends AbstractTestNGCucumberTests {


}
