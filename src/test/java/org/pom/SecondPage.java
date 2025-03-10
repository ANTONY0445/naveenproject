package org.pom;

import org.basee.NaveenBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage extends NaveenBase {
	
	public SecondPage() {

		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//h2[text()='My Account']")
//	private WebElement validaccount;
//	
//	public WebElement getValidaccount() {
//		return validaccount;
//	}
	
	
	@FindBy(xpath = "//a[text()='Address Book']")
	private WebElement addressbook;
	
	public WebElement getAddressbook() {
		return addressbook;
	}
	
	@FindBy(xpath = "//a[text()='New Address']")
	private WebElement newaddress;
	
	public WebElement getNewaddress() {
		return newaddress;
	}
	
	@FindBy(xpath = "//a[text()='Add Address']")
	private WebElement addAddress;
	
	public WebElement getAddAddress() {
		return addAddress;
	}
	
	
	
	@FindBy (xpath ="//input[@ class='form-control']")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy (xpath = "//input[@id='input-lastname']")
	private WebElement lastname;
	
	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;
	
	public WebElement getCompany() {
		return company;
	}
	
	@FindBy(xpath = "//input[@id='input-address-1']")
	private WebElement address1;

	public WebElement getAddress1() {
		return address1;
	}
	
	@FindBy(xpath = "//input[@id='input-address-2']")
	private WebElement adderss2;
	
	public WebElement getAdderss2() {
		return adderss2;
	}
	
	
	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;
	
	public WebElement getCity() {
		return city;
	}
	
	@FindBy(xpath = "//input[@name='postcode']")
	private WebElement postcode;
	
	public WebElement getPostcode() {
		return postcode;
	}
	
	
	@FindBy(xpath = "//select[@id='input-country']")
	private WebElement country;
	
	public WebElement getCountry() {
		return country;
	}
	
	
	
	@FindBy(xpath = "//select[@id='input-zone']")
	private WebElement region;
	
	public WebElement getRegion() {
		return region;
	}
	
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radiobutton;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continuebutton;
	
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	
	@FindBy(xpath ="//a[text()='Address Book']")
	private WebElement addressbookbutton;
	
	public WebElement getAddressbookbutton() {
		return addressbookbutton;
	}
	
	@FindBy(xpath="//h2[text()='Address Book Entries']")
	private WebElement  validateaddbookentries;
	
	public WebElement getValidateaddbookentries() {
		return validateaddbookentries;
	}
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement  clickeditbutton;
	
	public WebElement getClickeditbutton() {
		return clickeditbutton;
	}
	
	
	@FindBy(xpath="//input[@placeholder='Address 2']")
	private WebElement  editaddress2;
	
	public WebElement getEditaddress2() {
		return editaddress2;
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement  clickcontinue;
	
	public WebElement getClickcontinue() {
		return clickcontinue;
	}
	
	@FindBy(xpath="//a[@class='list-group-item']")
	private WebElement  myaccountbutton;
	
	public WebElement getMyaccountbutton() {
		return myaccountbutton;
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement  myaccountpage;
	
	public WebElement getMyaccountpage() {
		return myaccountpage;
	}
	
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement  desktopmenu;
	
	public WebElement getDesktopmenu() {
		return desktopmenu;
	}
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement showall;
	
	public WebElement getShowall() {
		return showall;
	}
	
	@FindBy(xpath="//option[text()='Model (A - Z)']")
	private WebElement  sortby;
	
	public WebElement getSortby() {
		return sortby;
	}
	
	@FindBy(xpath="//option[text()='20']")
	private WebElement  numofproduct;
	public WebElement getNumofproduct() {
		return numofproduct;
	}
	
	@FindBy(xpath="(//div[@class='image'])[9]")
	private WebElement  findproduct;
	public WebElement getFindproduct() {
		return findproduct;
	}
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement  atcbuttonvalidate;
	public WebElement getAtcbuttonvalidate() {
		return atcbuttonvalidate;
	}
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement  addtheproduct;
	public WebElement getAddtheproduct() {
		return addtheproduct;
	}
	
//	@FindBy(xpath="(//span[text()='Shopping Cart']")
//	private WebElement  cartmenu;
//	public WebElement getCartmenu() {
//		return cartmenu;
//	}
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartmenu;
	public WebElement getCartmenu() {
		return cartmenu;
	}
	
//	@FindBy(xpath="((//i[@class='fa fa-shopping-cart'])[1]")
	@FindBy(xpath="//strong[text()=' View Cart']")
	private WebElement showcart;
	public WebElement getShowcart() {
		return showcart;
	} 
	
	
	@FindBy(xpath="//h2[text()='What would you like to do next?']")
	private WebElement  shopcartpagevalidate;
	public WebElement getShopcartpagevalidate() {
		return shopcartpagevalidate;
	}
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement  checkoutbutton;
	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}
	
	@FindBy(xpath="//h1[text()='Checkout']")
	private WebElement  checkoutmgsvalidate;
	public WebElement getCheckoutmgsvalidate() {
		return checkoutmgsvalidate;
	}
	
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement  myaccountmenu;
	public WebElement getMyaccountmenu() {
		return myaccountmenu;
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement  logoutmenu;
	public WebElement getLogoutmenu() {
		return logoutmenu;
	}
	
	@FindBy(xpath="//h1[text()='Account Logout']")
	private WebElement  validatelogout;
	public WebElement getValidatelogout() {
		return validatelogout;
	}
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement clickcontine;
	public WebElement getClickcontine() {
		return clickcontine;
	}
	
	
}


