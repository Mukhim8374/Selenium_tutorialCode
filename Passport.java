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
//
//public class Passport {
//		static WebDriver driver;
//		
//	public static void main(String[] args) throws IOException {
//		
//		Properties prop = new Properties();
//		
//		FileInputStream ip = new FileInputStream("C:\\Users\\Mukhim\\eclipse-workspace\\Selenium1\\src\\Selenium22\\passportIndia.properties");
//		
//		prop.load(ip);
//		
//		String browser = prop.getProperty("Browser");
//		
//		if(browser.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
//			driver = new ChromeDriver();
//			
//		}
//		else if(browser.equals("FF")) {
//			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
//			driver = new FirefoxDriver();
//			
//		}
//		
//		driver.get(prop.getProperty("URL"));
//		
//		
//	}
//
//}
