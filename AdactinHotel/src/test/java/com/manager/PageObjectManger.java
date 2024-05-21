package com.manager;

import com.pages.BookPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchPage;
import com.pages.SelectPage;

public class PageObjectManger {

	private LoginPage loginpage;
	private SearchPage searchpage;
	private SelectPage selectPage;
	private BookPage bookPage;
	private CancelBookingPage cancelPage;
	
	public LoginPage getLoginPage() {
		return (loginpage==null)? loginpage = new LoginPage():loginpage;
		
	}
	
	public SearchPage getSearchPage() {
		return (searchpage==null)? searchpage = new SearchPage():searchpage;
		
	}
	
	public SelectPage getSelectPage() {
		return (selectPage==null)? selectPage = new SelectPage():selectPage;

	}
	
	public BookPage getBookPage() {
		return (bookPage==null)? bookPage= new BookPage(): bookPage;
		
	}
	
	public CancelBookingPage getCancelPage() {
		return (cancelPage==null)? cancelPage = new CancelBookingPage(): cancelPage;
		
	}
	
	
}

