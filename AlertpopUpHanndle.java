package Selenium22;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopUpHanndle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
//		Thread.sleep("5000");
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alertmsg");
		}
		else {
			System.out.println("Wrong");
		}
				
		
//		System.out.println(alert);
		
		driver.switchTo().alert().accept();
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
