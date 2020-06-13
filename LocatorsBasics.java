package Selenium22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class LocatorsBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
//		driver.get("http://www.google.com");
		//Xpath::
		
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Mukhim");
//		
//		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("DADA");
		
//		driver.findElement(By.name("submit")).click();
		
		//2. ID
		
//		driver.findElement(By.name("firstname")).sendKeys("Mukhim");
//		
//		driver.findElement(By.id("lastname")).sendKeys("Danekari");
//		
		//3.Name::
		
//		driver.findElement(By.name("firstname")).sendKeys("India");
//		driver.findElement(By.id("lastname")).sendKeys("Graet");
		
		//4.LinkText::
//		driver.findElement(By.linkText("Gmail")).click();
		
		//5.partialLinkText::(not useful most) and not recommended
		
//		driver.findElement(By.partialLinkText("Selenium Automation Hy")).click();
		
		//6.css selector::
		
//		driver.findElement(By.cssSelector("#lastname")).sendKeys("Mauaua");
		
		//7.class::
		
//		driver.findElement(By.className("dt-mobile-menu-icon")).click();
		
	}

}
