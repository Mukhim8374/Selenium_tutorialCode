package Selenium22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.SwitchToFrame;

//import sun.jvm.hotspot.oops.java_lang_Class;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).click();
		
//		Alert alert = driver.switchTo().alert().accept();
		
//		alert.accept();
		String alertmasgString = driver.switchTo().alert().getText();
		
		System.out.println(alertmasgString);
		Thread.sleep(5000);
//		alert.accept();
		
	}

}
