//package tempTestPack;
//
//import java.util.ArrayList;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import pages.AddToCart;
//import pages.CheckSearchBox;
//import pages.LoginpageOrSignUP;
//import pages.SearchBox;
//
//public class Test3 {
//
//
//    public static void main(String[]args) {
//    System.setProperty("webdriver.chrome.driver", "C:\\selenium folder\\chromedriver_win32 (2)\\chromedriver.exe");
//    WebDriver driver=new ChromeDriver();
//    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//    driver.get("https://www.amazon.in/");
//    LoginpageOrSignUP loginpageOrSignUP=new LoginpageOrSignUP(driver);
//   
//    
//    CheckSearchBox checkSearchBox =new CheckSearchBox(driver);
//    checkSearchBox.checkingSearchBox();
//    
//    
//    //searchBox.submitButton();
//    
//    
//   // searchBox.submitButton();
//  
//    
//    
//    
//  //input[@id='add-to-cart-button']
//    
//    AddToCart addToCart=new AddToCart(driver);
//    addToCart.clickaddToCartz();
//    
//    addToCart.buyProceedToCheckout();
//    
//    
//    
//    
//}
//}