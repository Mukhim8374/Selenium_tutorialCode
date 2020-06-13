package Selenium22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		
		driver.switchTo().frame("iframe1");
		driver.findElement(By.name("s")).sendKeys("Mukhim");
		
		
		
		
	}

}
