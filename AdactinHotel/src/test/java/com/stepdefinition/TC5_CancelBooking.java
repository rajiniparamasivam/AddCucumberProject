package com.stepdefinition;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.base.BaseClass;
import com.manager.PageObjectManger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_CancelBooking extends BaseClass{

	PageObjectManger pom = new PageObjectManger();

	@When("User perform the cancel Booking")
	public void user_perform_the_cancel_booking() {
	    
		implicityWait(30);
		
		pom.getCancelPage().cancelBooking();
	}
	
	@Then("User should verify after cancel Booking success message {string}")
	public void user_should_verify_after_cancel_booking_success_message(String expCancelSuccessMsg) {
	  
		WebElement successMsg = pom.getCancelPage().getSuccessMsg();
		String actCancelSuccessMsg = successMsg.getText();
		
		Assert.assertTrue(actCancelSuccessMsg.equals(expCancelSuccessMsg),"verify after cancel Booking success massage");
	//	Assert.fail(actCancelSuccessMsg);
		
	}
   
	
	@When("User perform cancel Booking using exiting orderId {string}")
	public void user_perform_cancel_booking_using_exiting_order_id(String orderId) {
	    
		pom.getCancelPage().exitingOrderId(orderId);
	}








}
