package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManger;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonPage extends BaseClass {
	
	PageObjectManger pom = new PageObjectManger();

	

	@Then("User should verify the after login success message {string}")
	public void user_should_verify_the_after_login_success_message(String expLoginSuccessMsg) {
	    
		WebElement loginSuccessMsg = pom.getLoginPage().getLoginSuccessMsg();
		String actLoginSuccessMsg = elementGetAttributeValue(loginSuccessMsg);
		
		Assert.assertEquals("Verify the Login Success Message", expLoginSuccessMsg, actLoginSuccessMsg);
	}



	









	

	





	






}
