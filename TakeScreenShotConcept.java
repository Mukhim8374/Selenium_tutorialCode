//package Selenium22;
//
////import java.io.File;
////import java.util.concurrent.TimeUnit;
//import java.io.IOException;
//import org.apache.commons.exec.util.*;;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TakeScreenShotConcept {
//
//	private static final String FileUtils = null;
//
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.get("https://www.google.com/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		// Below two lines of code we need to remember::
////		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
////		FileUtils.copyFile(src, new File("C:\\Users\\Mukhim\\eclipse-workspace\\Selenium1\\src\\Selenium22/google.png"));
//		
//		
//		
//		
//		
//	}
//
//}
