package com.Yatra.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	
	public static WebDriver driver;
	
	
	@FindBy(id = "BE_flight_origin_city")
	private WebElement Source;
	
	@FindBy(id = "BE_flight_arrival_city")
	private WebElement Destination;
	
	@FindBy(id = "BE_flight_origin_date")
	private WebElement Calender;
	
	@FindBy(id = "06/08/2020")
	private WebElement Date;
	
	@FindBy(id = "BE_flight_flsearch_btn")
	private WebElement Search;
	
	@FindBy(xpath = "//*[@id=\"Flight-APP\"]/section/section[1]/div/div[1]/div/div[2]/div[7]/span")
	private WebElement Filters;
	
	@FindBy(xpath = "//*[@id=\"Flight-APP\"]/section/section[1]/div/div[1]/div/div[2]/div[2]/label[1]/p")
	private WebElement Fastest;
	
	@FindBy(xpath = "//*[@id=\"Flight-APP\"]/section/section[1]/div/div[2]/div/div/div[2]/div/div/div/div[2]")
	private WebElement Cheapest;
	
	@FindBy(xpath = "//*[@id=\"Flight-APP\"]/section/section[1]/div/div[1]/div/div[2]/div/div/div[2]/div[3]/input")
	private WebElement ApplyFilter;
	
	@FindBy(xpath = "//*[@id=\"MAAHYDI551720200806HYDBOMI531020200806_AASAPI\"]/div/div[1]/div[4]/div/div[2]/button")
	private WebElement Book;
	
	
	public BookingPage(WebDriver ldriver)  {
	
	this.driver = ldriver;
	PageFactory.initElements(ldriver, this);
	
	
	
	
	}


	public WebElement getSource() {
		return Source;
	}


	public WebElement getDestination() {
		return Destination;
	}


	public WebElement getCalender() {
		return Calender;
	}


	public WebElement getDate() {
		return Date;
	}


	public WebElement getSearch() {
		return Search;
	}


	public WebElement getFilters() {
		return Filters;
	}


	public WebElement getFastest() {
		return Fastest;
	}


	public WebElement getCheapest() {
		return Cheapest;
	}


	public WebElement getApplyFilter() {
		return ApplyFilter;
	}


	public WebElement getBook() {
		return Book;
	}
}
