package Selenium22;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpathConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//	1	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bookes");
//	2	driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		Thread.sleep(2000);
//	3	driver.findElement(By.xpath("//span[@class='a-size-base a-color-base']")).click();
		
//	4	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Mukhim");
		
//	5	driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).sendKeys("Mukhim");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[starts-with(@class,'_3Ep3')]")).click();
		
	}

}
