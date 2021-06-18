package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {
	public  WebDriver driver;

	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radio_button;
	
	public Select_Hotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getRadio_button() {
		return radio_button;
	}

	public WebElement getContinue_button() {
		return continue_button;
	}

	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement continue_button;
			
}
