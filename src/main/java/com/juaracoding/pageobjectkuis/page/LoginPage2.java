package com.juaracoding.pageobjectkuis.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobjectkuis.drivers.s.DriverSingleton2;

public class LoginPage2 {

	private WebDriver driver;

	public LoginPage2() {
		this.driver = DriverSingleton2.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;

	public void login(String username, String password) {
		this.username.sendKeys("Admin");
		this.password.sendKeys("admin1234");
		btnLogin.click();

		String txtInvalidLogin = driver.findElement(By.xpath("//strong[normalize-space()='ERROR']")).getText();
		System.out.println(txtInvalidLogin);
		if (txtInvalidLogin.contains("ERROR")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}

	}

}
