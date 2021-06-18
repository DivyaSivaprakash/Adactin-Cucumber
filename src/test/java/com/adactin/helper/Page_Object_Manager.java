package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.pom.Book_Itinerary_Page;
import com.Adactin.pom.Booking_Confirmation_Page;
import com.Adactin.pom.Booking_Page;
import com.Adactin.pom.Home_Page;
import com.Adactin.pom.Search_Hotel_Page;
import com.Adactin.pom.Select_Hotel_Page;

public class Page_Object_Manager {
	public WebDriver driver;
	
	private Home_Page  home;  //Home_Page home = new Home_Page(driver);
	private Search_Hotel_Page search;//Search_Hotel_Page search= new Search_Hotel_Page(driver);
	private Select_Hotel_Page select;//Select_Hotel_Page select = new Select_Hotel_Page(driver);
	private Booking_Page book;//Booking_Page book = new Booking_Page(driver);
	private Booking_Confirmation_Page confirm;//Booking_Confirmation_Page confirm = new Booking_Confirmation_Page(driver);
	private Book_Itinerary_Page Itinerary;//Book_Itinerary_Page Itinerary = new Book_Itinerary_Page(driver)

public Page_Object_Manager(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
	}

public Home_Page get_Instance_home() {
	home = new Home_Page(driver);
	return home;
}

public Search_Hotel_Page get_Instance_search() {
 search=new Search_Hotel_Page(driver);
return search;
}

public Select_Hotel_Page get_Instance_Select() {
	select=new Select_Hotel_Page(driver);
	return select;
}
public Booking_Page get_Instance_Book() {
	book=new Booking_Page(driver);
	return book;
}
public Booking_Confirmation_Page get_Instance_confirm() {
	confirm=new Booking_Confirmation_Page(driver);
	return confirm;
}
public Book_Itinerary_Page get_Instance_Itinerary() {
	Itinerary=new Book_Itinerary_Page(driver);
	return Itinerary;
}








}


