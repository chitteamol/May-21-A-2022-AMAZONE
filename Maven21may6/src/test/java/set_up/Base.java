package set_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base{
	 
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium folder\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	     return driver;
	}
	public static WebDriver openFirefoxBrowser() {

	  System.setProperty("webdriver.gecko.driver", "C:\\selenium folder\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    return driver;
	}
} 