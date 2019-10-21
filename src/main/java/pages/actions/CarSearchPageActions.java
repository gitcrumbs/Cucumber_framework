package pages.actions;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageActions {
	
	//WebDriver driver=null;
	
	CarSearchPageLocators CarSearchPageLocators=null;
	public  CarSearchPageActions()
	{
		//this.driver=driver;
		this.CarSearchPageLocators= new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), CarSearchPageLocators);
	}

	public void selectCarMaker(String carBrand)
	{
		
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='makes']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarMaker=new Select(CarSearchPageLocators.carMakerDropDown);
		selectCarMaker.selectByVisibleText("BMW");
		
	}
	
	public void selectCarModel(String carModel)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='models']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectCarModel=new Select(CarSearchPageLocators.selectModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}
	public void selectLocation(String location)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='locations']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectLocation=new Select(CarSearchPageLocators.selectLocation);
		selectLocation.selectByVisibleText(location);
	}
	public void selectPrice(String price)
	{
		//SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='price-max']")).click();
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		Select selectPrice=new Select(CarSearchPageLocators.priceList);
		selectPrice.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton()
	{
		SeleniumDriver.getDriver().findElement(By.xpath(".//*[@id='block-system-main']/div/div/div/div/div/form")).click();
		CarSearchPageLocators.findMyNextCarButton.click();
		
	}
	
	
	
}
