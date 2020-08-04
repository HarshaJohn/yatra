package com.Yatra.Helper;

import org.openqa.selenium.WebDriver;

import com.Yatra.Pom.BookingPage;

public class PageObjectManager {

	
	public WebDriver driver;
	
	public BookingPage bp;
	
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	
		}

		public BookingPage getBp() {
			
			BookingPage bp = new BookingPage(driver);
			return bp;
		}
			
	
	
	
	
	
	
}
