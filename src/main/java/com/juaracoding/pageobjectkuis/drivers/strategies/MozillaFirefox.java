package com.juaracoding.pageobjectkuis.drivers.strategies;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.juaracoding.pageobjectkuis.drivers.strategies.*;
public class MozillaFirefox implements DriverStrategy2 {

	public WebDriver setStrategy () {
	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	return driver;
	}

}


