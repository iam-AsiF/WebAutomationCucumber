package WebStepDefinition.XYZBank;

import POM.XYZBank.XYZBankWebElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class BML3DeleteCustomerStepDefinition {
    static WebDriver driver;
    XYZBankWebElements xyz;
    @Given("manager clicks on the customers tab")
    public void managerClicksOnTheCustomersTab() {
        XYZBankWebElements xyz = new XYZBankWebElements(driver);
        xyz.customersTab();
    }

    @When("manager searches for the newly added customer")
    public void managerSearchesForTheNewlyAddedCustomer() throws InterruptedException {
        xyz.searchCustomer();
    }

    @Then("manager deletes the customer")
    public void managerDeletesTheCustomer() throws InterruptedException {
        xyz.deleteCustomer();
    }
}
