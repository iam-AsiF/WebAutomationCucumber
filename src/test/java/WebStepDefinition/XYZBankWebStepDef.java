package WebStepDefinition;

import Core.Helper;
import POM.XYZBankWebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class XYZBankWebStepDef {

    WebDriver driver;
    XYZBankWebElements xyz;

    // Manager adds a customer
    @Given("Manager lands on the XYZ bank home page")
    public void managerLandsOnTheXYZBankHomePage() {
//        Helper helper = new Helper();
//        driver = helper.webURL("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        Helper hlp = new Helper();
        driver = hlp.chromeLaunch();
        driver.manage().window().maximize();
        driver = hlp.webUrl("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @When("manager clicks on bank manager login option")
    public void managerClicksOnBankManagerLoginOption() throws InterruptedException {
        xyz = new XYZBankWebElements(driver);
        xyz.BankManagerLoginOption();
    }

    @And("clicks on add customer tab")
    public void clicksOnAddCustomerTab() {
        xyz.addCustomerTab();
    }

    @And("sends customer {string} and {string} and {string}")
    public void sendsCustomerFirstNameAndLastNameAndPostCode(String firstName, String lastName, String postCode) throws InterruptedException {
        System.out.println("data verification=> first name: " + firstName + ", last Name: " + lastName + ", post code: " + postCode);
        xyz.customerData(firstName, lastName, postCode);
    }

    @And("clicks on add customer button")
    public void clicksOnAddCustomerButton() throws InterruptedException {
        xyz.addCustomerButton();
    }

    @Then("manager closes confirmation alert for newly added customer")
    public void managerClosesConfirmationAlertForNewlyAddedCustomer() throws InterruptedException {
        xyz.confirmationMsg1();

//        // feature 2
//        xyz.openAccountTab();
//
//        xyz.selectCustomer();
//
//        xyz.selectCurrency();
//
//        xyz.processButton();
//
//        xyz.confirmationMsg2();
//
//        // feature 3
//        xyz.customersTab();
//
//        xyz.searchCustomer();
//
//        xyz.deleteCustomer();
    }

    // Manger opens account with the newly created customer
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


    // Manger deletes the newly created customer
    @Given("manager clicks on the customers tab")
    public void managerClicksOnTheCustomersTab() {
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
