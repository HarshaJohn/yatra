package com.Yatra.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class ConfigurationReader {
	
	
	
static Properties p;

	
	public ConfigurationReader() throws IOException {
		
		File f = new File("/Users/jokaaru/Harsha's-eclipse/YatraDotCom/src/test/java/com/Yatra/Properties/Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		
		Properties p = new Properties();
		p.load(fis);
	}
	
	public String getChrome() {
		
		return p.getProperty("browser");
	}

	public String getSafari() {
		
		return p.getProperty("browser2");
	}
	
	public String getUrl() {
		
		return p.getProperty("url");
	}
	
	
	public String getSource() {
		
		return p.getProperty("Source");
	}
	
	public String getDestination() {
		
		return p.getProperty("Destination");
	}
	
	
	
	
	
	
	
}






