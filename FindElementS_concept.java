package Selenium22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindElementS_concept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Get the total count of the links on the page
		//get the text of each link
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
		
		for(int i=0; i<linklist.size(); i++) {
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
			
			
		}
		
		
		
		
	}

}
