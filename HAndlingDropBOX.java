package Selenium22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class HAndlingDropBOX {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		//HAndling dropbox'
		
//		Select select = new Select(driver.findElement(By.id("continents")));
	
//		select.selectByVisibleText("North America");
		
		driver.findElement(By.name("firstname")).sendKeys("DADADA");
		driver.findElement(By.id("lastname")).sendKeys("BABAB");
//		driver.findElement(By.id("sex-0")).click();
//		driver.findElement(By.cssSelector("#exp-4")).click();
		driver.findElement(By.id("datepicker")).sendKeys("15 Aug");
		driver.findElement(By.id("profession-1")).click();
		
		Select select = new Select(driver.findElement(By.id("continents")));
		select.selectByVisibleText("Africa");
		
		Select select2 = new Select(driver.findElement(By.id("continentsmultiple")));
		select2.selectByVisibleText("Asia");
	}
 
}
