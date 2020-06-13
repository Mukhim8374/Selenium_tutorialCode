package Selenium22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class RegistationPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys("Jethalal");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("Gada");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("GukulDham Socienty, B wing");
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("Gada@gmail.com");
		
		
		driver.findElement(By.xpath("//input[contains(@type,'tel')]")).sendKeys("99999999");
		driver.findElement(By.xpath("//input[contains(@type,'radio')]")).click();
		
		driver.findElement(By.id("checkbox1")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).sendKeys("Gujrati and Hindi");
		
//		driver.findElement(By.id("msdd")).sendKeys("Gujarati");
//		driver.findElement(By.className("ui-autocomplete-multiselect ui-state-default ui-widget")).sendKeys("cccc");
		
		Select select = new Select(driver.findElement(By.id("Skills")));
		select.selectByVisibleText("CSS");
		
		Select select1 = new Select(driver.findElement(By.id("countries")));
		select1.selectByVisibleText("India");
		
//		Select select2 = new Select(driver.findElement(By.xpath("//span[contains(@class,select2-selection__arrow)]")));
//		Select select2 = new Select(driver.findElement(By.className("select2-selection__arrow")));
//		select2.selectByVisibleText("India");
		
		Select select3 = new Select(driver.findElement(By.id("yearbox")));
		select3.selectByVisibleText("1995");
		
		Select select4 = new Select(driver.findElement(By.id("yearbox")));
		select4.selectByVisibleText("1995");
		
		Select select5 = new Select(driver.findElement(By.xpath("//select[contains(@placeholder,'Month')]")));
		select5.selectByVisibleText("August");
		
		Select select51 = new Select(driver.findElement(By.id("daybox")));
		select51.selectByVisibleText("15");
		
		driver.findElement(By.xpath("//input[contains(@id,'firstpassword')]")).sendKeys("Mukhim");
		driver.findElement(By.xpath("//input[contains(@id,'secondpassword')]")).sendKeys("Mukhim");
		
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\Mukhim\\Desktop\\Office Docs");
	}

}
