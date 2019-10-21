package steps;


import java.util.List;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;
import utils.SeleniumDriver;

public class UsedCarSearchSteps {
	
	

	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarsSearchPageActions usedCarsSearchPageActions= new UsedCarsSearchPageActions();
	@Given("^I navigate to the  Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_navigate_to_the_Home_Page_of_CarsGuide_Website(String url)  {
	   SeleniumDriver.openPage(url);
	}

	@When("^I move to Car-For-Sale Menu$")
	public void i_move_to_Car_For_Sale_Menu()  {
		carsGuideHomePageActions.moveToCarsForSaleMenu();
	    
	}

	@When("^click on submenu Used Cars Search link$")
	public void click_on_submenu_Used_Cars_Search_link()  {
		carsGuideHomePageActions.clickOnUsedSearchCarsMenu();
	}

	@When("^select carMaker from AnyMake dropdown$")
	public void select_carMaker_from_AnyMake_dropdown(List<String> carMaker)  {
	    
	    usedCarsSearchPageActions.selectCarMaker(carMaker.get(1));
	}

	@When("^select  car model$")
	public void select_car_model(List<String> list)  {
		System.out.println("carModel-->"+list.get(1));
		String carModel=list.get(1);
		usedCarsSearchPageActions.selectCarModel(carModel);
	    
	}

	@When("^select location  from SelectLocation dropdown$")
	public void select_location_from_SelectLocation_dropdown(List<String> location)  {
	   usedCarsSearchPageActions.selectLocation(location.get(1));
	}

	@When("^select price$")
	public void select_price(List<String> price)  {
		System.out.println("price-->"+price.get(1));
	    usedCarsSearchPageActions.selectPrice(price.get(1));
	    
	}

	@When("^click on Find_My_Car button$")
	public void click_on_Find_My_Car_button()  {
	    usedCarsSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see list of Used cars$")
	public void i_should_see_list_of_Used_cars()  {
	   System.out.println("Used car list populated");
	}

	@SuppressWarnings("deprecation")
	@Then("^the page title should match expected title  \"([^\"]*)\"$")
	public void the_page_title_should_match_expected_title(String expectedPageTitle)  {
		String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
	    System.out.println("Actual page title-->"+ActualPageTitle);
	    System.out.println("Expected page title-->"+expectedPageTitle);
	    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
		 
	}
}
