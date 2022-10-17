//package tempTestPack;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import pages.LoginpageOrSignUP;
//
//public class Test2 {
//	
//		    public static void main(String[]args) {
//		    System.setProperty("webdriver.chrome.driver", "C:\\selenium folder\\chromedriver_win32 (2)\\chromedriver.exe");
//		    WebDriver driver=new ChromeDriver();
//		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		    driver.get("https://www.amazon.in/");
//		    LoginpageOrSignUP  loginpageOrSignUP =new LoginpageOrSignUP(driver);
//		    loginpageOrSignUP.clickAccountAndList();
//		    
//		    loginpageOrSignUP.senduserName();
//		    loginpageOrSignUP.clickusercontinue();
//		    loginpageOrSignUP.sendpassword();
//		    loginpageOrSignUP.clickusercontinue();
//}
//}