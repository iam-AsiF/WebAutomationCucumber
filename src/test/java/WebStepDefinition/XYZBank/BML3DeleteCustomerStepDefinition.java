package WebStepDefinition.XYZBank;

import Core.Helper;
import POM.XYZBank.XYZBankWebElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static WebStepDefinition.XYZBank.BML1AddCustomerStepDef.driver;

public class BML3DeleteCustomerStepDefinition {
    XYZBankWebElements xyz = new XYZBankWebElements(driver);

    @Given("manager clicks on the customers tab")
    public void managerClicksOnTheCustomersTab() throws InterruptedException {
        xyz.customersTab();
    }

    @When("manager searches for the newly added customer")
    public void managerSearchesForTheNewlyAddedCustomer() throws InterruptedException {
        xyz.searchCustomer();
    }

    @Then("manager deletes the customer")
    public void managerDeletesTheCustomer() throws InterruptedException {
        xyz.deleteCustomer();
        Thread.sleep(2000);
        Helper hlp = new Helper();
        driver = hlp.closeBrowser();
    }
}
