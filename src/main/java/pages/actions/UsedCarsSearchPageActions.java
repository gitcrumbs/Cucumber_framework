package pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
	//WebDriver driver=null;
	UsedCarSearchPageLocators usedCarSearchPageLocators=null;
	public  UsedCarsSearchPageActions()
	{
		//this.driver=driver;
		this.usedCarSearchPageLocators= new UsedCarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPageLocators);
	}

	public void selectCarMaker(String carBrand)
	{
		
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='makes']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarMaker=new Select(usedCarSearchPageLocators.carMakerDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='models']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarModel=new Select(usedCarSearchPageLocators.selectModelDropDown);
		
		selectCarModel.selectByVisibleText(carModel);
		
		
	}
	public void selectLocation(String location)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='locations']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectLocation=new Select(usedCarSearchPageLocators.selectLocation);
		selectLocation.selectByVisibleText(location);
	}
	public void selectPrice(String price)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='price-max']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='price-max']")).click();
		Select selectPrice=new Select(usedCarSearchPageLocators.priceList);
		List<WebElement> list=selectPrice.getOptions();
		for(WebElement s:list)
		{
			System.out.println("--->"+s.getText());
		}
		selectPrice.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton()
	{
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		usedCarSearchPageLocators.findMyNextCarButton.click();
		
	}

}
