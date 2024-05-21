package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.datatable.DataTable;

public class BookPage extends BaseClass {
	
	
	public BookPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	@FindBy(id = "address")
	private WebElement txtBillingAddress;
	@FindBy(id = "cc_num")
	private WebElement txtCreditCardNumber;
	@FindBy(id = "cc_type")
	private WebElement dDnCreditCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement dDnMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement dDnYear;
	@FindBy(id = "cc_cvv")
	private WebElement txtCCVNumber;
	@FindBy(id = "book_now")
	private WebElement btnBookNow;
	@FindBy(xpath = "//td[contains(text(),'Book A Hotel ')]")
	private WebElement txtBookAHotelSuccessmsg;
	@FindBy(id = "first_name_span")
	private WebElement txtErrorMsgFirstName;
	@FindBy(id = "last_name_span")
	private WebElement txtErrorMsgLastName;
	@FindBy(id = "address_span")
	private WebElement txtErrorMsgAddress;
	@FindBy(id = "cc_num_span")
	private WebElement txtErrorMsg16DigitCreditCard;
	@FindBy(id = "cc_type_span")
	private WebElement txtErrorMsgCreditCardType;
	@FindBy(id = "cc_expiry_span")
	private WebElement txtErrorMsgCreditCardExMonth;
	@FindBy(id = "cc_cvv_span")
	private WebElement txtErrorMsgCCVNumber;
	@FindBy(xpath = "//td[contains(text(),'Booking Confirmation ')]")
	private WebElement txtBookingSuccessMessage;
	@FindBy(id = "order_no")
	private WebElement txtBookingOrderNumber;
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtBillingAddress() {
		return txtBillingAddress;
	}
	public WebElement getTxtCreditCardNumber() {
		return txtCreditCardNumber;
	}
	public WebElement getdDnCreditCardType() {
		return dDnCreditCardType;
	}
	public WebElement getdDnMonth() {
		return dDnMonth;
	}
	public WebElement getdDnYear() {
		return dDnYear;
	}
	public WebElement getTxtCCVNumber() {
		return txtCCVNumber;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public WebElement getTxtBookAHotelSuccessmsg() {
		return txtBookAHotelSuccessmsg;
	}
	public WebElement getTxtErrorMsgFirstName() {
		return txtErrorMsgFirstName;
	}
	public WebElement getTxtErrorMsgLastName() {
		return txtErrorMsgLastName;
	}
	public WebElement getTxtErrorMsgAddress() {
		return txtErrorMsgAddress;
	}
	public WebElement getTxtErrorMsg16DigitCreditCard() {
		return txtErrorMsg16DigitCreditCard;
	}
	public WebElement getTxtErrorMsgCreditCardType() {
		return txtErrorMsgCreditCardType;
	}
	public WebElement getTxtErrorMsgCreditCardExMonth() {
		return txtErrorMsgCreditCardExMonth;
	}
	public WebElement getTxtErrorMsgCCVNumber() {
		return txtErrorMsgCCVNumber;
	}
	public WebElement getTxtBookingSuccessMessage() {
		return txtBookingSuccessMessage;
	}
	public WebElement getTxtBookingOrderNumber() {
		return txtBookingOrderNumber;
	}
	
	
	public void bookHotel(String firstName, String lastName, String billingAddress, DataTable dataTable) {
		
		sendkeysAndEnter(getTxtFirstName(), firstName);
		sendkeysAndEnter(getTxtLastName(), lastName);
		sendkeysAndEnter(getTxtBillingAddress(), billingAddress);
		
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    
	    String ccNo = data.get(2).get("creditCardNo");
	    String ccType = data.get(2).get("creditCardType");
	    String eMoth = data.get(2).get("expiryMonth");
	    String eYear = data.get(2).get("expiryYear");
	    String cVVNo = data.get(2).get("cVVNumber");
	    
	    sendkeysAndEnter(getTxtCreditCardNumber(), ccNo);
	    selectOptionByValue(getdDnCreditCardType(), ccType);
	    selectOptionByValue(getdDnMonth(), eMoth);
	    selectOptionByValue(getdDnYear(), eYear);
	    sendkeysAndEnter(getTxtCCVNumber(), cVVNo);
	    elementClick(getBtnBookNow());

	}
	
	public void withoutEnterBookHotel() {
		elementClick(getBtnBookNow());

	}
	
}
