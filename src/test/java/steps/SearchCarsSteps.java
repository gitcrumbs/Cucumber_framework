package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.And;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageActions;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;


public class SearchCarsSteps {
	
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarSearchPageActions carSearchPageActions= new CarSearchPageActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String webSiteURL)  {
	    SeleniumDriver.openPage(webSiteURL);
	    
	}

	@When("^I move to Car For Sale Menu$")
	public void i_move_to_Car_For_Sale_Menu(List<String> list) {
		String menu=list.get(1);
		System.out.println("Menu-->"+menu);
		carsGuideHomePageActions.moveToCarsForSaleMenu();
	}
	

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchcars)  {
	    //SeleniumDriver.waitForPageToLoad();
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_from_dropdown(String carBrand) throws InterruptedException  {
		 SeleniumDriver.waitForPageToLoad();
		carSearchPageActions.selectCarMaker(carBrand);
		System.out.println("Car Brand selected");
	    
	}

	@And("^select \"([^\"]*)\" as car model$")
	public void select_car_model(String carModel)  {
		 SeleniumDriver.waitForPageToLoad();
		carSearchPageActions.selectCarModel(carModel);
	    
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_location_from_dropdown(String location)  {
		 SeleniumDriver.waitForPageToLoad();
	    carSearchPageActions.selectLocation(location);
	}

	@And("^select \"([^\"]*)\" as price$")
	public void select_price(String price)  {
		 SeleniumDriver.waitForPageToLoad();
		carSearchPageActions.selectPrice(price);
	    
	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_Button()  {
		 SeleniumDriver.waitForPageToLoad();
		carSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars()  {
	    
	    System.out.println("Car List Found");
	}


	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedPageTitle)  {
	    
	    String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
	    System.out.println("Actual page title-->"+ActualPageTitle);
	    System.out.println("Expected page title-->"+expectedPageTitle);
	    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
	 
	}


}
