package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation_Page {
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@class='reg_button'])[2]")
	private WebElement my_itinerary;

	public Booking_Confirmation_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

	
}
