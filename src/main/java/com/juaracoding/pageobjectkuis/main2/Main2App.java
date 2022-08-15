package com.juaracoding.pageobjectkuis.main2;


import org.openqa.selenium.WebDriver;


import com.juaracoding.pageobjectkuis.drivers.s.DriverSingleton2;
import com.juaracoding.pageobjectkuis.page.LoginPage2;
import com.juaracoding.pageobjectkuis.page.RegisterPage;

public class Main2App{
	public static void main(String[] args) {
		
		DriverSingleton2.getInstance("Firefox");
		WebDriver driver = DriverSingleton2.getDriver();
		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		LoginPage2 loginPage = new LoginPage2();
		loginPage.login("Admin","admin1234");
		
		
		RegisterPage registerPage = new RegisterPage();
		registerPage.register("janji","afdmin1213@gmail.com","admin1234!!!!");
		
		
		delay(10);
		driver.quit();
	}
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}



