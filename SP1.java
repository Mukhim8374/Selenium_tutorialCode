package Selenium22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.classfile.StackMapTable_attribute.chop_frame;

public class SP1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		WebElement text = driver.findElement(By.name("q"));
		text.sendKeys("Aajtak");
		text.submit();
		WebElement text1 = driver.findElement(By.name("LC20lb"));
//		text.sendKeys("Aajtak");
		text.submit();
		
//		WebElement mailString = driver.findElement(By.className("gb_g"));
//		mailString.submit();
		
		String titleString = driver.getTitle();
		System.out.println(titleString);
	}

}
