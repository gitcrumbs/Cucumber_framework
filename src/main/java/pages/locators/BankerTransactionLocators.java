package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankerTransactionLocators {
	
	
	public static final String CUSTOMER_LOGIN = "//button[contains(text(),'Customer Login')]";
	public static final String BANKER_NAME = "//select[@name='userSelect']";
	public static final String LOGIN_BUTTON="//button[contains(text(),'Login')]";
	public static final String ACCOUNT_SELECT="//select[@name='accountSelect']";
	public static final String AMOUNT_DEPOSIT=".form-control.ng-pristine.ng-invalid";
	public static final String DEPOSIT_BUTTON="//button[@class='btn btn-default']";
	public static final String AMOUNT_DEPOSIT_BUTTON="//button[@ng-class='btnClass2']";
	public static final String TRANSACTIONS_BUTTON="//button[@ng-class='btnClass1']";
	public static final String BACK_BUTTON="//button[contains(text(),'Back')]";
	
	@FindBy(xpath=CUSTOMER_LOGIN)
	public WebElement loginpagebutton;
	
	
	@FindBy(xpath=BANKER_NAME)
	public WebElement bankerSelect;
	
	@FindBy(xpath=LOGIN_BUTTON)
	public WebElement loginbutton;
	
	@FindBy(xpath=ACCOUNT_SELECT)
	public WebElement selectaccount;
	
	@FindBy(xpath=AMOUNT_DEPOSIT_BUTTON)
	public WebElement amountdepositbutton;
	
	@FindBy(css=AMOUNT_DEPOSIT)
	public WebElement amountdeposit;
	
	@FindBy(xpath=DEPOSIT_BUTTON)
	public WebElement depositbutton;
	
	@FindBy(xpath=TRANSACTIONS_BUTTON)
	public WebElement transactionsbutton;
	
	@FindBy(xpath=BACK_BUTTON)
	public WebElement backbutton;

}
