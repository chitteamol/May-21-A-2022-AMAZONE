//package tempTestPack;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import pages.AmazonSciencePage;
//import pages.LoginpageOrSignUP;
//import pages.ReasearchAreasPage;
//import pages.ReasearchAreasPage;
//
//public class Test4 {
//	public static void main(String[]args) {
//	    System.setProperty("webdriver.chrome.driver", "C:\\selenium folder\\chromedriver_win32 (2)\\chromedriver.exe");
//	    WebDriver driver=new ChromeDriver();
//	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//	    
//	 
//	    driver.get("https://www.amazon.in/");
//	    LoginpageOrSignUP  loginpageOrSignUP =new LoginpageOrSignUP(driver);
//	    loginpageOrSignUP.openAmazonScience();
//	    
//	    String amazonSciencePageURL=driver.getCurrentUrl();
//	    if(amazonSciencePageURL.equals("https://www.amazon.science/")) {
//	    	System.out.println("AmazonScience URL is varified");
//	    	
//	    }
//	    else
//	    {
//	    	System.out.println("AmazonScience URL is wrong");
//
//	    }
//	    
//	    driver.manage().window().maximize();
//	    loginpageOrSignUP.openAmazonScience();
//	    AmazonSciencePage amazonSciencePage=new AmazonSciencePage(driver);
//	    amazonSciencePage.clickResearchAreas();
//	    
//	    ReasearchAreasPage reasearchAreasPage=new ReasearchAreasPage(driver);
//	     reasearchAreasPage.clickDmodeling();
//	    String url=driver.getCurrentUrl();{
//	    	System.out.println(url);
//	    }
//	    String title=driver.getTitle();{
//	    	System.out.println(title);
//	    }
//	    
//	    if(url.equals("https://www.amazon.science/tag/3d-modeling-imaging")) {
//	    	System.out.println("dmodeling URL is varified");
//	    	
//	    }
//	    else
//	    {
//	    	System.out.println("dmodeling URL is wrong");
//
//	    }
//	    
//	   
//	     reasearchAreasPage=new ReasearchAreasPage(driver);
//	     reasearchAreasPage.clickAmazonRekognition();
//	     String researchareasurl=driver.getCurrentUrl();{
//	    	System.out.println(researchareasurl);
//	    }
//	    
//	    if(url.equals("https://www.amazon.science/tag/amazon-rekognition")) {
//	    	System.out.println("amazonRekognition URL is varified");
//	    	
//	    }
//	    else
//	    {
//	    	System.out.println("amazonRekognition URL is wrong");
//
//	    }
//}}
//	 
//          
