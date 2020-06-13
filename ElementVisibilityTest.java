package Selenium22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//1.isDisplayed()::::::
		Boolean boolean1=driver.findElement(By.linkText("Login")).isDisplayed();
		System.out.println(boolean1);
		
		
		//1.isEnabled()::::::
		Boolean boolean2=driver.findElement(By.linkText("Login")).isEnabled();
		System.out.println(boolean2);
		
		//1.isSelected()::::::
		Boolean boolean3=driver.findElement(By.linkText("Login")).isSelected();
		System.out.println(boolean3);
		
		
	}

}
