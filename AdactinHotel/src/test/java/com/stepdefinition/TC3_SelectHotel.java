package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotel extends BaseClass{

	PageObjectManger pom = new PageObjectManger();

	@When("User perform the select hotel and click the continue button")
	public void user_perform_the_select_hotel_and_click_the_continue_button() {
		
		
		pom.getSelectPage().selectHotel();
	    
	}


	@Then("User should verify after continue success message {string}")
	public void user_should_verify_after_continue_success_message(String expSelectHotelSuccesMsg) {
	   
	  WebElement txtSuccessMsg = pom.getSelectPage().getTxtSuccessMsg();
	  String actSelectHotelSuccessMag = txtSuccessMsg.getText();
	  Assert.assertEquals("Verifying the Select Hotel Success Message", expSelectHotelSuccesMsg, actSelectHotelSuccessMag);
	}


	
	@When("User perform the without select hotel and click the continue button")
	public void user_perform_the_without_select_hotel_and_click_the_continue_button() {
	   
		pom.getSelectPage().withoutSelect();
	}
	
	

	@Then("User should verify after continue error message {string}")
	public void user_should_verify_after_continue_error_message(String expSelectHotelErrorMsg) {
	    
		WebElement txtContinueErrorMsg = pom.getSelectPage().getTxtContinueErrorMsg();
		String actSelectHotelErrorMsg = txtContinueErrorMsg.getText();
		
		Assert.assertEquals("Verifying the Select Hotel Error Message", expSelectHotelErrorMsg, actSelectHotelErrorMsg);
		
	} 

	
	
	

	















}
