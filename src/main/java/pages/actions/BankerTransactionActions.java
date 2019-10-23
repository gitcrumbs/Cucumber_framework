package pages.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import pages.locators.BankerTransactionLocators;
import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class BankerTransactionActions {

	BankerTransactionLocators banktransactionlocators = null;
	SeleniumHelper seleniumhelper = new SeleniumHelper();
	private SoftAssert sAssert;
	Logger logInformation = Logger.getLogger(this.getClass().toString());

	public BankerTransactionActions() {		
		
		this.banktransactionlocators = new BankerTransactionLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), banktransactionlocators);
	}

	public void CustomerloginClick() {

		try {
			if (banktransactionlocators.loginpagebutton != null) {
				banktransactionlocators.loginpagebutton.click();				
				logInformation.info("Loaded the Browser Url");

			}
		} catch (Exception e) {

			logInformation.info("Exception on button click for button click"+e.getMessage());

		}

	}
	
	
	
	public void clickonamountdeposit() {
		
		try {
			if (banktransactionlocators.amountdepositbutton != null) {
				banktransactionlocators.amountdepositbutton.click();

			}
		} catch (Exception e) {

			//

		}
		
	}
	
	
	public void enterAmountinTextBox(String amounttoenter) {
		
		try {			
			seleniumhelper.enterTextinTextboxfield(banktransactionlocators.amountdeposit, amounttoenter, "Entering "+amounttoenter+"in the amount to deposit field");	
			
		}catch(Exception e) {
			
		}
		
	}
	
	public void entervalueusingjavascriptexecutor(String amounttoenter) {
		
	}
	
	
	
	
	public void clickonDeposit() {
		
		
		try {
			if (banktransactionlocators.depositbutton != null) {
				seleniumhelper.clickusingActions(banktransactionlocators.depositbutton,"Clicking on deposit button");
				
			}
		} catch (Exception e) {
			System.out.println("Click not done");
		}	
	}
	

	public void selectCustomer(String value, String elementdescription) {

		try {
			banktransactionlocators.bankerSelect.click();
			SeleniumDriver.getDriver().findElement(By.xpath("//option[@ng-repeat='cust in Customers'][contains(text(),'" + value + "')]"))
					.click();	

		} catch (Exception e) {

		}

	}

	public void clickLoginButton() {

		try {
			if (banktransactionlocators.loginbutton != null) {
				banktransactionlocators.loginbutton.click();
			}
		} catch (Exception e) {

			//

		}

	}
	
	
	public boolean selectAccountNumber(String accountnumber) {
		
		 boolean accountnumberselected = false; 
		
		try {
			
			banktransactionlocators.selectaccount.click();
			SeleniumDriver.getDriver().findElement(By.xpath("//select[@ng-hide='noAccount']//option[contains(text(),'"+accountnumber+"')]"))
					.click();	
						
			if(seleniumhelper.isDropownValueSelected(banktransactionlocators.selectaccount, accountnumber)) {
				accountnumberselected = true;				 
			}else {
				accountnumberselected = false;
			}
			
			}catch(Exception e) {
			
		}
		return accountnumberselected;
		
		
	}

	public void clickOnTransactions() {
		// TODO Auto-generated method stub
		
		
		try {
			if (banktransactionlocators.transactionsbutton != null) {
				seleniumhelper.clickusingActions(banktransactionlocators.transactionsbutton,"Clicking on Transactions button");
				
			}
		} catch (Exception e) {
			
		}	
		
		
	}

	public void clickBackButton() {
		try {
			if (banktransactionlocators.backbutton != null) {
				seleniumhelper.clickusingActions(banktransactionlocators.backbutton,"Clicking on Transactions button");
				
			}
		} catch (Exception e) {
			System.out.println("Click not done");
		}
		
	}
}
