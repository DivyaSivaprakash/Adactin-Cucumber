package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
	public WebDriver driver;

	@FindBy(xpath="//input[@name='first_name']")
	private WebElement first_name;
	
	public Booking_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit_card_no() {
		return credit_card_no;
	}

	public WebElement getCredit_card_type() {
		return credit_card_type;
	}

	public WebElement getExpiry_month() {
		return expiry_month;
	}

	public WebElement getExpiry_year() {
		return expiry_year;
	}

	public WebElement getCcv_no() {
		return ccv_no;
	}

	public WebElement getBooknow_button() {
		return booknow_button;
	}

	@FindBy(xpath="(//input[@class='reg_input'])[2]")
	private WebElement last_name;
	
	@FindBy(xpath="//textarea[@class='txtarea']")
	private WebElement address;
	
	@FindBy(xpath="(//input[@class='reg_input'])[3]")
	private WebElement credit_card_no;
	
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement credit_card_type;
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	private WebElement expiry_month;
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[2]")
	private WebElement expiry_year;
	
	@FindBy(xpath="(//input[@name='cc_cvv'])")
	private WebElement ccv_no ;
	
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement booknow_button;
	
	
	
}
