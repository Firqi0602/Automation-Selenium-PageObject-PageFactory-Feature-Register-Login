package com.juaracoding.pageobjectkuis.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobjectkuis.drivers.s.DriverSingleton2;

public class RegisterPage {
	private WebDriver driver;

	public RegisterPage() {
		this.driver = DriverSingleton2.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement password;

	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnRegister;

	public void register (String username, String email, String password) {
		this.username.sendKeys("janji");
		this.email.sendKeys("afdmin1213@gmail.com");
		this.password.sendKeys("admin1234!!!!");
		btnRegister.click();

		String txtInvalidRegister = driver.findElement(By.xpath("//strong[normalize-space()='Error:']")).getText();
		System.out.println(txtInvalidRegister);
		if (txtInvalidRegister.contains("Error")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}

	}

	
		
	}



