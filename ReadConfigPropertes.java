//package Selenium22;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.sql.Driver;
//import java.util.Properties;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.GeckoDriverInfo;
//import org.yaml.snakeyaml.Yaml;
//
//public class ReadConfigPropertes {
//		static WebDriver driver;
//		
//	public static void main(String[] args) throws IOException {
//		
//		Properties prop = new Properties();
//		
//		FileInputStream ip = new FileInputStream("C:\\Users\\Mukhim\\eclipse-workspace\\Selenium1\\src\\Selenium22\\config.properties");
//		
//		prop.load(ip);
//		
//		System.out.println(prop.getProperty("name"));
//		
//		System.out.println(prop.getProperty("URL"));
//		
//		String browserName = prop.getProperty("Browser");
//		
//		String URL = prop.getProperty("URL");
//				
//		
//		
//		if(browserName.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
//			
//		else if(browserName.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "C:\\chromedriver_win32\\gecko.exe");
//			driver = new FirefoxDriver();
//			
//			
//		}
//			
//		driver.get(URL);
//		driver.findElement(By.xpath(prop.getProperty("userName_Xpath"))).sendKeys(prop.getProperty("userName"));
//		driver.findElement(By.xpath(prop.getProperty("password_Xpath"))).sendKeys(prop.getProperty("password"));
//		driver.findElement(By.xpath(prop.getProperty("Login_Xpath"))).click();
//		
//	}
//		
//	
//	
//}
