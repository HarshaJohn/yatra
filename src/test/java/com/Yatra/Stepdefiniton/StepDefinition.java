package com.Yatra.Stepdefiniton;

import org.bson.BsonDbPointer;
import org.openqa.selenium.WebDriver;

import com.Yatra.BaseClass.BaseClass;
import com.Yatra.Helper.FileReaderManager;
import com.Yatra.Helper.PageObjectManager;
import com.Yatra.Runner.Runner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	
	
	@Given("^The Booking is open and running$")
	public void the_Booking_is_open_and_running() throws Throwable {
      naviTo(FileReaderManager.getInstance().getCrInstance().getUrl());
      maxim();
      Thread.sleep(5000);
		throw new PendingException();
	}

	@When("^The user enters Source location$")
	public void the_user_enters_Source_location() throws Throwable {
       sendText(pom.bp.getSource(), FileReaderManager.getInstance().getCrInstance().getSource());
		throw new PendingException();
	}

	@When("^The user enters destination$")
	public void the_user_enters_destination() throws Throwable {
sendText(pom.bp.getDestination(), FileReaderManager.getInstance().getCrInstance().getDestination());
		throw new PendingException();
	}

	@When("^The user picks the date of travel$")
	public void the_user_picks_the_date_of_travel() throws Throwable {
		clicks(pom.bp.getCalender());
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pom.bp.getDate());
		Thread.sleep(500);
		throw new PendingException();
	}

	@When("^The user clicks on Search Flights$")
	public void the_user_clicks_on_Search_Flights() throws Throwable {
	  clicks(pom.bp.getSearch());
	    throw new PendingException();
	}

	@Then("^A new page is at screen$")
	public void a_new_page_is_at_screen() throws Throwable {
	    throw new PendingException();
	}

	@Given("^The user has access to define his search options using filters$")
	public void the_user_has_access_to_define_his_search_options_using_filters() throws Throwable {
	    throw new PendingException();
	}

	@When("^The user clicks on More Filters$")
	public void the_user_clicks_on_More_Filters() throws Throwable {
	   clicks(pom.bp.getFilters());
	    throw new PendingException();
	}

	@When("^The user choses Fastest flight$")
	public void the_user_choses_Fastest_flight() throws Throwable {
	   clicks(pom.bp.getFastest());
	    throw new PendingException();
	}

	@When("^The user choses cheapest flight$")
	public void the_user_choses_cheapest_flight() throws Throwable {
	//	danD(pom.bp.getCheapest(), attriButes(element););
	    throw new PendingException();
	}

	@When("^The user clicks Search Again$")
	public void the_user_clicks_Search_Again() throws Throwable {
	    clicks(pom.bp.getApplyFilter());
	    throw new PendingException();
	}

	@Then("^The application presents the best option as per user's choice$")
	public void the_application_presents_the_best_option_as_per_user_s_choice() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
