package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotel extends BaseClass{
	
	PageObjectManger pom = new PageObjectManger();

	@When("User perform the {string},{string} and {string}")
	public void user_perform_the_and(String firstName, String lastName, String billingAddress, io.cucumber.datatable.DataTable dataTable) {
	   
		pom.getBookPage().bookHotel(firstName, lastName, billingAddress, dataTable);
	}
	@Then("User should verify after booking hotel success message {string} and save the order id")
	public void user_should_verify_after_booking_hotel_success_message_and_save_the_order_id(String expBookingSuccessMsg) {
	  
		implicityWait(30);
		WebElement txtBookingSuccessMessage = pom.getBookPage().getTxtBookingSuccessMessage();
		String actBookingSuccessMsg = txtBookingSuccessMessage.getText();
		System.out.println(actBookingSuccessMsg);
		
		Assert.assertEquals("Verify the Booking Conformation Success Message", expBookingSuccessMsg, actBookingSuccessMsg);
	}

	

	@When("User perform the booking hotel and without select all fields")
	public void user_perform_the_booking_hotel_and_without_select_all_fields() {
	
		pom.getBookPage().withoutEnterBookHotel();
	}
	@Then("User should verify after booking hotel error message {string},{string},{string},{string},{string},{string},{string}")
	public void user_should_verify_after_booking_hotel_error_message(String expFirstNameErrorMsg, String expLastNameErrorMsg, String expAddressErrorMsg, String expCCNErrorMsg, String expCCTErrorMsg, String expExpiryMonthErrorMsg, String expCVVNoErrorMsg) {
	   
		WebElement txtErrorMsgFirstName = pom.getBookPage().getTxtErrorMsgFirstName();
		String actFirstNameErrorMsg = txtErrorMsgFirstName.getText();
		
		WebElement txtErrorMsgLastName = pom.getBookPage().getTxtErrorMsgLastName();
		String actLastNameErrorMsg = txtErrorMsgLastName.getText();
		
		WebElement txtErrorMsgAddress = pom.getBookPage().getTxtErrorMsgAddress();
		String actAddressErrorMsg = txtErrorMsgAddress.getText();
		
		WebElement txtErrorMsg16DigitCreditCard = pom.getBookPage().getTxtErrorMsg16DigitCreditCard();
		String actCCNErrorMsg = txtErrorMsg16DigitCreditCard.getText();
		
		WebElement txtErrorMsgCreditCardType = pom.getBookPage().getTxtErrorMsgCreditCardType();
		String actCCTErrorMsg = txtErrorMsgCreditCardType.getText();
		
		WebElement txtErrorMsgCreditCardExMonth = pom.getBookPage().getTxtErrorMsgCreditCardExMonth();
		String actExpiryMonthErrorMsg = txtErrorMsgCreditCardExMonth.getText();
		
		WebElement txtErrorMsgCCVNumber = pom.getBookPage().getTxtErrorMsgCCVNumber();
		String actCCVErrorMsg = txtErrorMsgCCVNumber.getText();
		
		Assert.assertEquals("Verify the First Name ", expFirstNameErrorMsg, actFirstNameErrorMsg);
		Assert.assertEquals("Verify the Last Name ", expLastNameErrorMsg, actLastNameErrorMsg);
		Assert.assertEquals("Verify the Address  ", expAddressErrorMsg, actAddressErrorMsg);
		Assert.assertEquals("Verify the 16 Digit Credit Cart No ", expCCNErrorMsg, actCCNErrorMsg);
		Assert.assertEquals("Verify the Credit Cart Type ", expCCTErrorMsg, actCCTErrorMsg);
		Assert.assertEquals("Verify the Credit Cart Expiry Month ", expExpiryMonthErrorMsg, actExpiryMonthErrorMsg);
		Assert.assertEquals("Verify the CVV Number ", expCVVNoErrorMsg, actCCVErrorMsg);
		
		
	}





}
