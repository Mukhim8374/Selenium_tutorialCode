package Selenium22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementconcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//1. Case
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();	
//		driver.get("https://www.spicejet.com/Default.aspx");
//		
//		
////		driver.findElement(By.linkText("DEALS")).click();
//		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("SpiceMax")).click();
		
		/* case 2 
		driver.get("https://www.bankofbaroda.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Loans"))).build().perform();
		actions.moveToElement(driver.findElement(By.linkText("Home Loan Types"))).build().perform();
		driver.findElement(By.linkText("Baroda Home Loan")).click();*/
		
		//3.case...multiple hierachial
		
		driver.get("https://www.bankofmaharashtra.in/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions actions  = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Deposit Scheme"))).build().perform();
		actions.moveToElement(driver.findElement(By.linkText("Saving Deposit"))).build().perform();
		actions.moveToElement(driver.findElement(By.linkText("NRI"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("RFC")).click();
		
		
		
	}

}
