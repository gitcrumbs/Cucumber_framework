package steps;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.BankerTransactionActions;
import test.listeners.CucCustomTestListener;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

@Listeners(CucCustomTestListener.class)	
public class BankerTransactions {
	
	
	BankerTransactionActions  bankerTransactionActions = new BankerTransactionActions(); ;
	
	
	
	@Given("^I am on the Home Page \"([^\"]*)\" of XYZ Bank Website$")
	public void i_am_on_the_Home_Page_of_XYZ_Bank_Website(String siteurl) throws Throwable {	   
		
		Reporter.log("Launching siteurl"+siteurl);
		SeleniumDriver.openPage(siteurl);		
		bankerTransactionActions.CustomerloginClick();	
		
	}

	@When("^I Select the name as <Menu>$")
	public void i_Select_the_name_as_Menu(List<String> menuName) throws Throwable {
	  		
		Reporter.log("Selecting customer as"+menuName.get(0));
		bankerTransactionActions.selectCustomer(menuName.get(0), "Selecting "+menuName.get(0)+"from the dropdown");
				
	}

	@When("^click on \"([^\"]*)\" button$")
	public void click_on_button(String arg1) throws Throwable {
	 
		Reporter.log("Clicking on Loginbutton");
		bankerTransactionActions.clickLoginButton();		
	}
	

	@When("^select Account Number <Account Number> from dropdown$")
	public void select_Account_Number_Account_Number_from_dropdown(List<String> accountnumber) throws Throwable {
	  
		bankerTransactionActions.selectAccountNumber(accountnumber.get(2).toString());
		bankerTransactionActions.clickonamountdeposit();
		
		
	}
	
	

	@When("^Create <Multiple Deposits>$")
	public void create_Multiple_Deposits(List<String> dropdownvalues) throws Throwable {
		
	
		bankerTransactionActions.enterAmountinTextBox(dropdownvalues.get(0).toString());
		bankerTransactionActions.clickonDeposit();
		bankerTransactionActions.clickOnTransactions();
		bankerTransactionActions.clickBackButton();	
		bankerTransactionActions.clickonamountdeposit();
		bankerTransactionActions.enterAmountinTextBox(dropdownvalues.get(0).toString());
		bankerTransactionActions.clickonDeposit();
		
		
	}

	@Then("^the message on the screen should be \"([^\"]*)\"$")
	public void the_message_on_the_screen_should_be(String arg1) throws Throwable {
	   
		Assert.fail();
		
	}
	
	

}
