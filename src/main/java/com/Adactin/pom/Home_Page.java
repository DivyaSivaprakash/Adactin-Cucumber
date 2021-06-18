package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
public WebDriver driver;

	@FindBy(xpath = "(//input[@class='login_input'])[1]")
	private WebElement userName; 

	

	

	public Home_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	@FindBy(xpath="(//input[@class='login_input'])[2]")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='login_button']")
	private WebElement loginbutton;

	
	
	
	
	
	
	
	
	
	
	
}
