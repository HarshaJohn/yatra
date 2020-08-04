package com.Yatra.BaseClass;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	//
	public static WebDriver browserLaunch(String browser) {
		
		{if (browser.equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrome.driver","/Users/jokaaru/Harsha's-eclipse/YatraDotCom/Drivers/chromedriver 2");

		driver = new ChromeDriver();
	}

	else if (browser.equalsIgnoreCase("safari")) {
		System.setProperty("webdriver.safari.driver",
				"C:\\Users\\Vigneshwari\\eclipse-workspace\\KenzoAutomation\\driver\\IEDriverServer.exe");
		driver = new SafariDriver();
	}

	else {
		System.out.println("Invalid broswer");
	}


driver = new ChromeDriver();
		
}
		return driver;	
}
	//dropDown
	
	public static void dropDown(WebElement element, String option, String value) {
		Select s = new Select(element);
	if (option.equals("index")) {
		s.selectByIndex(Integer.parseInt(value));
	}
	else if (option.equals("value")) {
		s.selectByValue(value);
	}
	else if (option.equals("text")) {
		s.selectByVisibleText(value);
	}
	
	}	
		
		//send text
	public static void sendText(WebElement element, String value) {
	element.sendKeys(value);
	}	
	
	//click
	public static void clicks(WebElement element) {
		element.click();
	}
	
	  //screenshot 
	public static void sS(String fileName) throws IOException {
	 	try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("/Users/jokaaru/eclipse-workspace/SeleniumConcepts/Screenshots/" + fileName + ".png");
			FileUtils.copyDirectory(src, des);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	// alerts
   public static void alertOk() {
	  Alert alert = driver.switchTo().alert();
  alert.accept();
  }
	
	public static void alertDismiss() {
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public static void alertPrompt() {
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("whatever asked");
		alert.accept();
		
	}
	
	// sleep
	
	public static void sleep(long secs) throws InterruptedException {
		
		Thread.sleep(secs);
	}
	
	// navigateTo
	
	public static void naviTo(String url) {
		
		driver.navigate().to(url);
	}
	
	//forward
	
	public static void naviForward() {
		
		driver.navigate().forward();
	}
	
	
	// back
	
	public static void naviBack() {
		
		driver.navigate().back();
	
	}
	
	// refresh
	
	public static void naviRefresh() {
		
		driver.navigate().refresh();
	}
	
	// enabled
	
	public static void enabled(WebElement element) {
		
		element.isEnabled();
	}
	
	// displayed
	
	public static void dispalyed(WebElement element) {
		
		element.isDisplayed();
		
	}
	
	// selected
	
	public static void selected(WebElement element) {
		
		element.isSelected();
	}
	
	// getTitle
	
	public static void getTitle(String title) {
		
		driver.getTitle();
	}
	
	//currentUrl
	
	public static void crntUrl(String url) {
		
		driver.getCurrentUrl();
		
	}
	
	//text
	
	public static void txt(WebElement element) {
		
        System.out.println(element.getText());	
	}
	
	//attributes
	
	public static void attriButes(WebElement element) {
		
		String attriButes = element.getAttribute("Value");
		
	}
	
	//options *
	
	public static void options(WebElement element) {
		
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement s1: options) {
			System.out.println(s1.getText());
		}
	}
	
	
//	right click
	
	public static void rightClick(WebElement element) {
		
		Actions actn = new Actions(driver);
		actn.contextClick(element).build().perform();
		
	}
	
	
	// double click
	
	public static void doubleClick(WebElement element) {
		
		Actions actn1 = new Actions(driver);
		actn1.doubleClick(element).build().perform();
		
	}
	
	// drag and drop
	
	public static void dragAndDrop(WebElement source, WebElement dest) {
		Actions actn2 = new Actions(driver);
		actn2.dragAndDrop(source, dest).build().perform();
		
	}
	
	
	// drag and drop using 
	
	public static void danD(WebElement slider, double value)
	{
	    double minValue = Double.parseDouble(slider.getAttribute("aria-valuemin"));
	    double maxValue = Double.parseDouble(slider.getAttribute("aria-valuemax"));
	    int sliderH = slider.getSize().height;
	    int sliderW = slider.getSize().width;
	    System.out.println(sliderH);
	    System.out.println(sliderW);
	    Actions action = new Actions(driver);
	    action.moveToElement(slider, (int) (value * sliderW / (maxValue - minValue)), sliderH / 2).click().build().perform();
	}
	
	
	//move to element
	
	public static void hover(WebElement target) {
		Actions actn3 = new Actions(driver);
		actn3.moveToElement(target).build().perform();
		
	}
	
	
	// single frame
	
	public static void singleFrame(int i) {
		
		driver.switchTo().frame(i);
		
	}
	
	
	// multi-frames
	
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
		
	}
	
	// frame back to app

	public static void dfltCntnt() {
	
	driver.switchTo().defaultContent();
	
	}
	
	
	//radio
	
	public static void radioButton(WebElement element) {
		element.click();
		
	}
	
	//implicit wait
	
	public static void implicitwait(int i) {
	
	driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);
	
	}
	
	// maximize
	
	public static void maxim() {
		
		driver.manage().window().maximize();
	}
	
	
	//close
	
	public static void close() {
		driver.close();
		
	}
	
	// quit
	
	public static void quit() {
		driver.quit();
		
	}
	
	
// window handling

	public static void windowHnadle(String element) {
		
		String pid = driver.getWindowHandle();
	System.out.println(pid);
	
	Set<String> ids = driver.getWindowHandles();
	for (String id : ids) {
	System.out.println(id);
	
	
	String title = driver.switchTo().window(id).getTitle();
	System.out.println(title);
	
	}
	
	String actualTitle = element;
	
	for (String id : ids) {
		
	
	if (driver.switchTo().window(id).getTitle().equals(actualTitle)) {
		break;
		
	}	
	}
	}
	
	
	
	
}
