package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "order_no")
	private WebElement orderId;
	
    @FindBy(xpath = "//input[@value='My Itinerary']")
	private WebElement myItinerary;
	
	@FindBy(id = "order_id_text")
	private WebElement searchId;
	
	@FindBy(id = "search_hotel_id")
	private WebElement goBtn;
	
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement cancelBooking;
	
	@FindBy(id = "search_result_error")
	private WebElement successMsg;
	
	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	private WebElement bookItinerary;
	
	
	public WebElement getBookItinerary() {
		return bookItinerary;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getSearchId() {
		return searchId;
	}

	public WebElement getGoBtn() {
		return goBtn;
	}

	public WebElement getCancelBooking() {
		return cancelBooking;
	}

	public WebElement getSuccessMsg() {
		return successMsg;
	}
	

	public WebElement getOrderId() {
		return orderId;
	}
	
	
	

	public void cancelBooking() {
		
		  String orderId = elementGetAttributeValue(getOrderId());
		
          elementClick(getMyItinerary());
          sendkeysAndEnter(getSearchId(),orderId);
          elementClick(cancelBooking);
          alertOk();
          
	}
	public void exitingOrderId(String orderId) {
		
	
		elementClick(getBookItinerary());
		sendkeysAndEnter(getSearchId(),orderId);
		elementClick(getCancelBooking());
		alertOk();

	}
	
}
