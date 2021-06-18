package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Itinerary_Page {
	public WebDriver driver;

	@FindBy(xpath="(//input[@class='reg_button'])[3]")
	private WebElement logout;

	public Book_Itinerary_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		}

	public WebElement getLogout() {
		return logout;
	}

}
