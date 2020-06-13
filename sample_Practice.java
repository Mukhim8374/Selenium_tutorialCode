package Selenium22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.MaximizeWindow;

public class sample_Practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mukhim");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Danekari");
		
		
		
		
	}

}
