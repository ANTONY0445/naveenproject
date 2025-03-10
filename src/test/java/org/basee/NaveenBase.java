package org.basee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaveenBase {

	public static WebDriver driver;

	public void initDriver(String browsertype) {

		switch (browsertype) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		default:
			System.out.println("invalid browser type");
			break;
		}
		driver.manage().window().maximize();

	}

	public void LaunchUrl(String url) {
		driver.get(url);
	}

	public void sendKeysByJava(WebElement element, String keysToSend) {

		element.sendKeys(keysToSend);
	}

	public void click(WebElement element) {

		element.click();
	}

	public void getTextByJava(WebElement element) {

		element.getText();
	}

	public void selectby(WebElement element, String value, String selecttype) {
		Select select = new Select(element);

		switch (selecttype) {

		case "value":
			select.selectByValue(value);
			break;
		case "text":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("InValid Value");
			break;
		}
	}

	public void sendkeys(WebElement element) {

		element.sendKeys("keysToSend");

	}

	public void clear(WebElement element) {

		element.clear();

	}

	public void navigate(String commands) {

		switch (commands) {
		case "refresh":
			driver.navigate().refresh();
			break;
		case "forward":
			driver.navigate().forward();
			break;
		case "backward":
			driver.navigate().back();
			break;

		default:
			System.out.println("invalid commands");

			break;
		}

	}
	
	public void quiteAndClose() {

		driver.quit();
	}

}
