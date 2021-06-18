package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	public  WebDriver driver;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[1]")
	private WebElement location;
	
	

	public Search_Hotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChilds() {
		return childs;
	}

	public WebElement getSearch_button() {
		return search_button;
	}

	@FindBy(xpath="(//select[@class='search_combobox'])[2]")
	private WebElement hotels;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	private WebElement roomtype;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[4]")
	private WebElement no_of_rooms;
	
	@FindBy(xpath="(//input[@class='date_pick'])[1]")
	private WebElement check_in;
	
	@FindBy(xpath="(//input[@class='date_pick'])[2]")
	private WebElement check_out;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[5]")
	private WebElement adults;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[6]")
	private WebElement childs;
	
	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement search_button;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

