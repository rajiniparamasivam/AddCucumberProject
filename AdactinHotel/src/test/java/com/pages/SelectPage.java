package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectPage extends BaseClass{
	
	public SelectPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;
	
    @FindBy(id = "continue")
	private WebElement continueBtn;
    
    @FindBy(xpath = "(//td[@class='login_title'])[2]")
    private WebElement txtSuccessMsg;
    
    @FindBy(xpath = "//label[@id='radiobutton_span']")
    private WebElement txtContinueErrorMsg;
	
	public WebElement getTxtSuccessMsg() {
		return txtSuccessMsg;
	}
	public WebElement getTxtContinueErrorMsg() {
		return txtContinueErrorMsg;
	}
    public WebElement getRadioBtn() {
		return radioBtn;
	}
    public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	public void selectHotel() {
		
		elementClick(getRadioBtn());
		elementClick(getContinueBtn());

	}
	public void withoutSelect() {
		
		elementClick(getContinueBtn());

	}
}
