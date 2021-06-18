Feature: Hotel Booking In Adactin Application

@SmokeTest
Scenario Outline: Adac
Given user Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page

Examples:
|username|password|
|sivaprakashdivya|shivanya|

@SanityTest
Scenario:
When user Select The Location In Location Field
And user Select The Hotel In Hotel Field
And user Select The Room Type In RoomType Field
And user Select The No. Of Rooms In Room Field
And user Enters The Date In check In Date Field
And user Enters The Date In check Out Date Field
And user Select Adults per Room In Adults per Room Field
And user Select Children Per Room In Children per Room Field
Then user Click On The Search Button And It Navigates To The Select Hotel Page

@SanityTest
Scenario:
When user Click The Radio Button To Select The Hotel
Then user Click On The Continue Button And It Navigates To The Booking Page

@SanityTest
Scenario:
When user Enter The Firstname In Firstname Field
And user Enter The Lastname In Lastname Field
And user Enter The Address In Billing Address Field
And user Enter The Credit Card No. In Credit Card No. Field
And user Select The Credit Card Type In Credit Card Type Field
And user Select The Month In Expiry Date Field
And user Select The Year In Expiry Date Field
And user Enter The Cvv No. In Cvv Field
Then user Click On The Book Now Button And It Navigates To The Booking Confirmation Page

@SanTest
Scenario:
Then user Click On The My Itinerary Button And It Navigates To The Book Itinerary Page

@RegressionTest
Scenario:
Then user Click On The Logout Button And It Navigates To The Logout Page

