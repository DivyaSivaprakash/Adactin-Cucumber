package com.adactin.step_definition;

import org.openqa.selenium.WebDriver;

import com.Adactin.base.Base_Class;
import com.adactin.Runner.Test_Runner;
import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;
	
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().get_url();
		get(url);
	}

	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		InputValue(pom.get_Instance_home().getUserName(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In password Field$")
	public void user_Enter_The_In_password_Field(String password) throws Throwable {
		InputValue(pom.get_Instance_home().getPassword(), password);
	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		ClickElement(pom.get_Instance_home().getLoginbutton());
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
		dropdownSelect(pom.get_Instance_search().getLocation(), "Melbourne", "byvalue");
	}

	@When("^user Select The Hotel In Hotel Field$")
	public void user_Select_The_Hotel_In_Hotel_Field() throws Throwable {
		dropdownSelect(pom.get_Instance_search().getHotels(), "Hotel Sunshine", "byvalue");
	}

	@When("^user Select The Room Type In RoomType Field$")
	public void user_Select_The_Room_Type_In_RoomType_Field() throws Throwable {
		dropdownSelect(pom.get_Instance_search().getRoomtype(), "Deluxe", "byvalue");
	}

	@When("^user Select The No\\. Of Rooms In Room Field$")
	public void user_Select_The_No_Of_Rooms_In_Room_Field() throws Throwable {
		dropdownSelect(pom.get_Instance_search().getNo_of_rooms(), "3", "byvalue");
	}

	@When("^user Enters The Date In check In Date Field$")
	public void user_Enters_The_Date_In_check_In_Date_Field() throws Throwable {
		InputValue(pom.get_Instance_search().getCheck_in(), "18/06/2021");
	}

	@When("^user Enters The Date In check Out Date Field$")
	public void user_Enters_The_Date_In_check_Out_Date_Field() throws Throwable {
		InputValue(pom.get_Instance_search().getCheck_out(), "19/06/2021");
	}

	@When("^user Select Adults per Room In Adults per Room Field$")
	public void user_Select_Adults_per_Room_In_Adults_per_Room_Field() throws Throwable {
		dropdownSelect(pom.get_Instance_search().getAdults(), "4", "byvalue");
	}

	@When("^user Select Children Per Room In Children per Room Field$")
	public void user_Select_Children_Per_Room_In_Children_per_Room_Field() throws Throwable {
		dropdownSelect(pom.get_Instance_search().getChilds(), "3", "byvalue");
	}

	@Then("^user Click On The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		ClickElement(pom.get_Instance_search().getSearch_button());
		Thread.sleep(1000);
	}

	@When("^user Click The Radio Button To Select The Hotel$")
	public void user_Click_The_Radio_Button_To_Select_The_Hotel() throws Throwable {
		ClickElement(pom.get_Instance_Select().getRadio_button());
		Thread.sleep(1000);
	}

	@Then("^user Click On The Continue Button And It Navigates To The Booking Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Booking_Page() throws Throwable {
		ClickElement(pom.get_Instance_Select().getContinue_button());
		Thread.sleep(1000);
	}

	@When("^user Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
		InputValue(pom.get_Instance_Book().getFirst_name(), "divya");
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		InputValue(pom.get_Instance_Book().getLast_name(), "sivaprakash");
	}

	@When("^user Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
		InputValue(pom.get_Instance_Book().getAddress(), "kkdnagar");
	}

	@When("^user Enter The Credit Card No\\. In Credit Card No\\. Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
		String ccno = File_Reader_Manager.getInstance().getInstanceCR().get_ccno();
		InputValue(pom.get_Instance_Book().getCredit_card_no(), ccno);
	}

	@When("^user Select The Credit Card Type In Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
		String cctype = File_Reader_Manager.getInstance().getInstanceCR().getcctype();
		dropdownSelect(pom.get_Instance_Book().getCredit_card_type(), cctype, "byvalue");
	}

	@When("^user Select The Month In Expiry Date Field$")
	public void user_Select_The_Month_In_Expiry_Date_Field() throws Throwable {
		String ccmonth = File_Reader_Manager.getInstance().getInstanceCR().getccmonth();
		dropdownSelect(pom.get_Instance_Book().getExpiry_month(),ccmonth , "byvalue");
	}

	@When("^user Select The Year In Expiry Date Field$")
	public void user_Select_The_Year_In_Expiry_Date_Field() throws Throwable {
		String ccyear = File_Reader_Manager.getInstance().getInstanceCR().getccyear();
		dropdownSelect(pom.get_Instance_Book().getExpiry_year(), ccyear, "byvalue");
		//Thread.sleep(9000);
		
	}

	@When("^user Enter The Cvv No\\. In Cvv Field$")
	public void user_Enter_The_Cvv_No_In_Cvv_Field() throws Throwable {
		String ccvno = File_Reader_Manager.getInstance().getInstanceCR().getccvno();
		InputValue(pom.get_Instance_Book().getCcv_no(), ccvno);
		Thread.sleep(9000);
	}

	@Then("^user Click On The Book Now Button And It Navigates To The Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
		ClickElement(pom.get_Instance_Book().getBooknow_button());
		Thread.sleep(9000);
	}

	@Then("^user Click On The My Itinerary Button And It Navigates To The Book Itinerary Page$")
	public void user_Click_On_The_My_Itinerary_Button_And_It_Navigates_To_The_Book_Itinerary_Page() throws Throwable {
		ClickElement(pom.get_Instance_confirm().getMy_itinerary());
	
	}

	@Then("^user Click On The Logout Button And It Navigates To The Logout Page$")
public void user_Click_On_The_Logout_Button_And_It_Navigates_To_The_Logout_Page() throws Throwable {
	ClickElement(pom.get_Instance_Itinerary().getLogout());
			}

}
