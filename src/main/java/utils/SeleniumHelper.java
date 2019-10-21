package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.BankerTransactionLocators;

public class SeleniumHelper {

	WebDriver driver;

	public SeleniumHelper() {

		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}

	public static boolean isElementPresent(WebElement webElement) {
		try {
			boolean isPresent = webElement.isDisplayed();
			return isPresent;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public void selectDropDownvalue(WebElement element, String valuetoSelect, String Elementdescription) {

		try {
			if (element == null) {

			} else {
				System.out.println("Going to hover element");
				hoveronElement(element);
				Select selectoption = new Select(element);
				selectoption.selectByValue(valuetoSelect);
			}

		} catch (Exception e) {

		}

	}

	public void enterTextinTextboxfield(WebElement element, String valuetoEnter, String Elementdescription) {

		try {

			element.clear();
			element.sendKeys(valuetoEnter);

		} catch (Exception e) {

			System.out.println("Entering text using javascript executor");
			entervalueusingjavascriptexecutor(element, valuetoEnter, Elementdescription);

		}

	}

	public void entervalueusingjavascriptexecutor(WebElement element, String valuetoEnter, String Elementdescription) {

		try {
			JavascriptExecutor jse = (JavascriptExecutor) SeleniumDriver.getDriver();
			jse.executeScript("arguments[0].value=" + valuetoEnter, element);

		} catch (Exception e) {

		}

	}

	public void clickUsingJs(WebElement element, String Elementdescription) {

		try {
			JavascriptExecutor executor = (JavascriptExecutor) SeleniumDriver.getDriver();
			executor.executeScript("arguments[0].click();", element);
		} catch (Exception e) {

		}

	}
	
	
	
	public void clickusingActions(WebElement element, String Elementdescription) {
		
		try {
			
			Actions builder = new Actions(SeleniumDriver.getDriver());
		    builder.moveToElement(element).click().perform();   
			}catch(Exception e) {
			
		}
		
	}

	

	public void hoveronElement(WebElement hovronElement) {
		Actions builder = new Actions(driver);
		builder.moveToElement(hovronElement).build().perform();
	}

	public boolean isDropownValueSelected(WebElement element, String optiontoselect) {

		boolean isvalueSelected = false;

		try {
			Select select = new Select(element);
			String visibleoption = select.getFirstSelectedOption().toString();

			if (optiontoselect.equals(visibleoption)) {
				isvalueSelected = true;
			} else {
				isvalueSelected = false;
			}

		} catch (Exception e) {

		}

		return isvalueSelected;

	}
}
