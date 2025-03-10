package org.step;

import org.basee.NaveenBase;
import org.openqa.selenium.WebElement;
import org.pom.LoginPage;
import org.pom.SecondPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Naveenstep {

	public static NaveenBase automation = new NaveenBase();
	public static LoginPage loginpage;
	public static SecondPage secondpage;

	@Given("Login Page")
	public void login_page() {

		loginpage = new LoginPage();

		WebElement username = loginpage.getUsername();
		automation.sendKeysByJava(username, "victorantony89733@gmail.com");

		WebElement passward = loginpage.getPassward();
		automation.sendKeysByJava(passward, "123456");

		WebElement login = loginpage.getLogin();
		automation.click(login);

		System.out.println("user crossed Login Page");

	}

	@When("Address Page")
	public void address_page() {

		try {

			secondpage = new SecondPage();

			automation.navigate("refresh");
//		automation.driver.navigate().refresh();

			WebElement addressbook = secondpage.getAddressbook();
			automation.click(addressbook);

			WebElement newaddress = secondpage.getNewaddress();
			automation.click(newaddress);

			WebElement firstname = secondpage.getFirstname();
			automation.sendKeysByJava(firstname, "antony");

			WebElement lastname = secondpage.getLastname();
			automation.sendKeysByJava(lastname, "kutty");

			WebElement company = secondpage.getCompany();
			automation.sendKeysByJava(company, "fast food");

			secondpage = new SecondPage();

			WebElement address1 = secondpage.getAddress1();
			automation.sendKeysByJava(address1, "erode");

			WebElement adderss2 = secondpage.getAdderss2();
			automation.sendKeysByJava(adderss2, "tamilnadu");

			WebElement city = secondpage.getCity();
			automation.sendKeysByJava(city, "chennai");

			WebElement postcode = secondpage.getPostcode();
			automation.sendKeysByJava(postcode, "638008");

			WebElement country = secondpage.getCountry();
			automation.click(country);
			automation.selectby(country, "99", "value");

			Thread.sleep(2000);

			WebElement region = secondpage.getRegion();
			automation.selectby(region, "1478", "value");

			Thread.sleep(2000);

			System.out.println("user crossed address page");

		} catch (Exception e) {
		}

	}

	@When("Radio button Page")
	public void radio_button_page() {

		WebElement radiobutton = secondpage.getRadiobutton();
		automation.click(radiobutton);

		WebElement continuebutton = secondpage.getContinuebutton();
		automation.click(continuebutton);

		if (secondpage.getValidateaddbookentries().isDisplayed()) {
			System.out.println("user is in Radio Button Page");
		}

		System.out.println("user crossed radio Button Page");
	}

	@When("Edit Address Page")
	public void edit_address_page() {

		try {

			WebElement clickeditbutton = secondpage.getClickeditbutton();
			automation.click(clickeditbutton);

			WebElement editaddress2 = secondpage.getEditaddress2();
			automation.clear(editaddress2);
			Thread.sleep(2000);
			WebElement editaddress22 = secondpage.getEditaddress2();
			automation.sendKeysByJava(editaddress22, "TamilNadu");

			WebElement clickcontinue = secondpage.getClickcontinue();
			automation.click(clickcontinue);

		} catch (Exception e) {
		}

		System.out.println("user crossed Edit Address Page");

	}

	@When("My Account Page")
	public void my_account_page() {

		WebElement myaccountbutton = secondpage.getMyaccountbutton();
		automation.click(myaccountbutton);

		if (secondpage.getMyaccountpage().isDisplayed()) {
			System.out.println("user is in my account page");
		}

		WebElement desktopmenu = secondpage.getDesktopmenu();
		automation.click(desktopmenu);

		WebElement showall = secondpage.getShowall();
		automation.click(showall);

		System.out.println("user crossed My Account Page");

	}

	@When("Cart Page")
	public void cart_page() {

		try {

			WebElement sortby = secondpage.getSortby();
			automation.click(sortby);

			WebElement numofproduct = secondpage.getNumofproduct();
			automation.click(numofproduct);

			WebElement findproduct = secondpage.getFindproduct();
			automation.click(findproduct);

			if (secondpage.getAtcbuttonvalidate().isDisplayed()) {
				System.out.println("user is in add to cart page");
			}

			WebElement addtheproduct = secondpage.getAddtheproduct();
			automation.click(addtheproduct);

			Thread.sleep(2000);

			WebElement cartmenu = secondpage.getCartmenu();
			automation.click(cartmenu);

			Thread.sleep(2000);

		} catch (Exception e) {
		}

		System.out.println("user crossed Cart Page");

	}

	@When("Shop Cart Page")
	public void shop_cart_page() {

		try {

			WebElement showcart = secondpage.getShowcart();
			automation.click(showcart);

			Thread.sleep(2000);

//		automation.driver.navigate().refresh();
			automation.navigate("refresh");

			if (secondpage.getShopcartpagevalidate().isDisplayed()) {
				System.out.println("user in the shopcart page");
			}

			Thread.sleep(2000);

			WebElement checkoutbutton = secondpage.getCheckoutbutton();
			automation.click(checkoutbutton);

		} catch (Exception e) {
		}

		System.out.println("user crossed Shop Cart Page");

	}

	@Then("Check Out Page")
	public void check_out_page() {

		if (secondpage.getCheckoutmgsvalidate().isDisplayed()) {
			System.out.println("user is in checkout page");
		}

		WebElement myaccountmenu = secondpage.getMyaccountmenu();
		automation.click(myaccountmenu);

		WebElement logoutmenu = secondpage.getLogoutmenu();
		automation.click(logoutmenu);

		if (secondpage.getValidatelogout().isDisplayed()) {
			System.out.println("user logout sucessfully");
		}

		WebElement clickcontine = secondpage.getClickcontine();
		automation.click(clickcontine);

		System.out.println("user crossed Check Out Page");

	}

}
