package Selenium22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HAndlingFileUploadpop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id=\"post-206\"]/header/h1/thrive_headline/input")).sendKeys("C:\\Users\\Mukhim\\Desktop\\ssss.txt");
		
		
	}

}
