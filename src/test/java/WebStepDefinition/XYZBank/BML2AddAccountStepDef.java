package WebStepDefinition.XYZBank;

import POM.XYZBank.XYZBankWebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static WebStepDefinition.XYZBank.BML1AddCustomerStepDef.driver;

public class BML2AddAccountStepDef {
    XYZBankWebElements xyz = new XYZBankWebElements(driver);

    @Given("Manager clicks on open account tab")
    public void managerClicksOnOpenAccountTab() {
        xyz.openAccountTab();
    }

    @When("manager selects customer name")
    public void managerSelectsCustomerName() throws InterruptedException {
        xyz.selectCustomer();
    }

    @And("selects currency type")
    public void selectsCurrencyType() throws InterruptedException {
        xyz.selectCurrency();
    }

    @And("clicks on process button")
    public void clicksOnProcessButton() throws InterruptedException {
        xyz.processButton();
    }

    @Then("manager closes confirmation alert for account creation")
    public void managerClosesConfirmationAlertForAccountCreation() {
        xyz.confirmationMsg2();
    }
}
