package com.juaracoding.pageobjectkuis.drivers.s;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobjectkuis.drivers.strategies.DriverStrategy2Implementer;
import com.juaracoding.pageobjectkuis.drivers.strategies.DriverStrategy2;


 public class DriverSingleton2{
	
	private static DriverSingleton2 instance = null;
	private static WebDriver driver;
	
	private DriverSingleton2(String driver) {
		instantiate (driver);
	}
	public WebDriver instantiate(String strategy) {
		DriverStrategy2 driverStrategy = DriverStrategy2Implementer.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	public static DriverSingleton2 getInstance(String driver) {
		if (instance == null) {
			instance = new DriverSingleton2(driver);
		}
	return instance;
	}
	public static WebDriver getDriver() {
	return driver;
	
	
	}
	}



