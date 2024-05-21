package com.stepdefinition;


import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.manager.PageObjectManger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotel {

	PageObjectManger pom = new PageObjectManger();
	

	@When("User perform search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_perform_search_hotel_and(String location, String hotels, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
	   
		pom.getSearchPage().searchAllFields(location, hotels, roomType, noOfRooms, checkInDate, checkOutDate, adultsPerRoom, childrenPerRoom);
	}
	@Then("User should verify after search hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String string) {
	   
	}
	@When("User perform search hotel by selecting mandatory fields only {string},{string},{string},{string} and {string}")
	public void user_perform_search_hotel_by_selecting_mandatory_fields_only_and(String location, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom) {
	   
		pom.getSearchPage().mandatoryFields(location, noOfRooms, checkInDate, checkOutDate, adultsPerRoom);
	}
	@Then("User should verify after search hotel date error message  {string} , {string}")
	public void user_should_verify_after_search_hotel_date_error_message(String expCheckInDateErrorMsg, String expCheckOutDateErrorMsg) {
	   
		WebElement checkIn = pom.getSearchPage().getTxtCheckInErrorMsg();
		String actCheckInDate = checkIn.getText();
		
		WebElement checkOut = pom.getSearchPage().getTxtCheckOutErrorMsg();
		String actCheckOutDate = checkOut.getText();
		
		Assert.assertEquals("Verifying the Check In Date Error Message",expCheckInDateErrorMsg , actCheckInDate);
		Assert.assertEquals("Verifying the Check Out Date Error Message",expCheckOutDateErrorMsg , actCheckOutDate);
	}
    @When("User should click search button without Enter any field")
	public void user_should_click_search_button_without_enter_any_field() {
	    
    	pom.getSearchPage().searchButtonClk();
	}
	@Then("User should verify error message after search hotel in location field {string}")
	public void user_should_verify_error_message_after_search_hotel_in_location_field(String expLocationErrorMsg) {
	   
		WebElement txtlocationErrorMsg = pom.getSearchPage().getTxtlocationErrorMsg();
		String actLocationErrorMsg = txtlocationErrorMsg.getText();
		Assert.assertEquals("Verifying the Location Errore Message",expLocationErrorMsg, actLocationErrorMsg);
		
	}









	










}
