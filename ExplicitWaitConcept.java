package Selenium22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
//		clickOn(driver, driver.findElement(By.xpath("//input[@value='Log In']")), 20);
//		clickOn(driver, driver.findElement(By.xpath("//input[contains(@value,'Log In')]")), 20);
		
//		clickOn(driver, driver.findElement(By.xpath("//a[contains(@class,'_8esh')]")), 20);
		clickOn(driver, driver.findElement(By.xpath("//button[contains(@type,'submit')]")), 20);
	}
	
	public static void clickOn(WebDriver driver,WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
	
}

	// for clickOn class it will be used  i.e to click something and checkby providing explicit wait
	//-we cant use it for dropdown ..alertpopup...we can just use it for click...For dropbox and other thing we need to creat other class fo them
