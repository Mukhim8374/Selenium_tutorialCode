package Selenium22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriver_Concept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("9980973262");
		driver.findElement(By.name("pass")).sendKeys("9986440179");
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

}
