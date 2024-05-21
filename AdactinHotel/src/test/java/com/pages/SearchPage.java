package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchPage extends BaseClass{

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="location")
	private WebElement location;
	
	@FindBy(id ="hotels")
	private WebElement hotels;
	
	@FindBy(id ="room_type")
	private WebElement roomType;

	@FindBy(id ="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id ="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id ="datepick_out")
	private WebElement checkOut;
	
	@FindBy(id ="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id ="child_room")
	private WebElement childRoom;
	
	@FindBy(id ="Submit")
	private WebElement searchButton;
	
	@FindBy(id ="checkin_span")
	private WebElement txtCheckInErrorMsg;
	
	@FindBy(id ="location_span")
	private WebElement txtlocationErrorMsg;
	
	@FindBy(id ="checkout_span")
	private WebElement txtCheckOutErrorMsg;
	
	@FindBy(id ="username_show")
	private WebElement txtLoginSuccess;
	
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	public WebElement getTxtCheckInErrorMsg() {
		return txtCheckInErrorMsg;
	}

	public WebElement getTxtlocationErrorMsg() {
		return txtlocationErrorMsg;
	}

	public WebElement getTxtCheckOutErrorMsg() {
		return txtCheckOutErrorMsg;
	}

	public WebElement getTxtLoginSuccess() {
		return txtLoginSuccess;
	}
	
	public void searchAllFields(String location,String hotels,String roomType,String numberOfRooms,String checkInDate, String checkOutDate,String adultsPerRoom,String childrenPerRooms) {
		
		selectOptionByValue(getLocation(), location);
		selectOptionByValue(getHotels(), hotels);
		selectOptionByValue(getRoomType(), roomType);
		selectOptionByValue(getNoOfRooms(), numberOfRooms);
		clear(getCheckIn());
		txtInput(getCheckIn(), checkInDate);
		clear(getCheckOut());
		txtInput(getCheckOut(), checkOutDate);
		selectOptionByValue(getAdultRoom(), adultsPerRoom);
		selectOptionByValue(getChildRoom(), childrenPerRooms);
		elementClick(getSearchButton());
	}
	
	public void mandatoryFields(String location,String numberOfRooms,String checkInDate, String checkOutDate,String adultsPerRoom) {
		
		selectOptionByValue(getLocation(), location);
		selectOptionByValue(getNoOfRooms(), numberOfRooms);
		clear(getCheckIn());
		txtInput(getCheckIn(), checkInDate);
		clear(getCheckOut());
		txtInput(getCheckOut(), checkOutDate);
		selectOptionByValue(getAdultRoom(), adultsPerRoom);
	}
	
	public void searchButtonClk() {
		
		elementClick(getSearchButton());

	}
	
	
	
	
	
	
	
	
	
	
	
}
