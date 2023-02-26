package TestRunner.XYZBank;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        tags = "@addCustomer or @openAccount or @deleteCustomer",

        features = {"src/test/resources/Features/XYZBank/bml1AddCustomer.feature",
                "src/test/resources/Features/XYZBank/bml2OpenAccount.feature",
                "src/test/resources/Features/XYZBank/bml3DeleteCustomer.feature"},

        glue = {"WebStepDefinition"},

        monochrome = true, dryRun = false, // runs feature file from class, so false to stop

        plugin = {
                "pretty", "html:build/reports/feature.html"
        }
)

@Test
public class XYZBankTestRunner extends AbstractTestNGCucumberTests {


}
