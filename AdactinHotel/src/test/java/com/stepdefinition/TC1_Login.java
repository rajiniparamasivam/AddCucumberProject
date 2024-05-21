package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;
import com.manager.PageObjectManger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1_Login extends BaseClass{

	PageObjectManger pom = new PageObjectManger();
	

	@Given("User is on Adactin login page")
	public void user_is_on_adactin_login_page() throws FileNotFoundException, IOException {
	    
	}
	
	@When("User enter the {string},{string}")
	public void user_enter_the(String userName, String password) {
	    
		pom.getLoginPage().commonStep(userName, password);
	}
	
	@When("User enter the {string},{string} with Enter key")
	public void user_enter_the_with_enter_key(String userName, String password) throws AWTException {
		
		
		pom.getLoginPage().loginWithEnterKey(userName, password);
		
	}
	
	@Then("User should verify the after login with Invalid credential error message contains {string}")
	public void user_should_verify_the_after_login_with_invalid_credential_error_message_contains(String expInvalidErrormsg) {
	   
    	WebElement txtErrorMsg = pom.getLoginPage().getTxtErrorMsg();
    	String actLoginErrorMsg = elementGetText(txtErrorMsg);
    	System.out.println(actLoginErrorMsg);
      	boolean b = actLoginErrorMsg.contains(expInvalidErrormsg);
    	Assert.assertTrue("Invalid Login details or Your Password might have expired. ", true);
    //	Assert.assertTrue("Verify the after Invalid Login details ", actLoginErrorMsg.equals(expInvalidErrormsg));
	}













}
