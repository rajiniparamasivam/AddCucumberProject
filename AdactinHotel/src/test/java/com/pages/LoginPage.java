package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement txtUserName;
	
	@FindBy(id = "password")
	private WebElement txtPassword;

    @FindBy(id = "login")
	private WebElement login;
	
    @FindBy(id = "username_show")
	private WebElement loginSuccessMsg;
    
	
	@FindBy(xpath = "//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement txtErrorMsg;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	public WebElement getLoginSuccessMsg() {
		return loginSuccessMsg;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getTxtErrorMsg() {
		return txtErrorMsg;
	}
	
	public void commonStep(String username, String password) {
		
		txtInput(getTxtUserName(), username);
		txtInput(getTxtPassword(), password);
        elementClick(getLogin());
	}
	
	public void loginStep(String username, String password) {
		
        commonStep(username, password);
        elementClick(getLogin());
	}
	
	public void loginWithEnterKey(String username, String password) throws AWTException {
		

		commonStep(username, password);
		robotKeyEnter();
	}
	
	
	
	
}
