package tempTestPack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.AmazonSciencePage;
import pages.LoginpageOrSignUP;
import pages.ReasearchAreasPage;
import set_up.Base;





public class TestSciencePage  extends Base{
	    private WebDriver driver;
	    private  LoginpageOrSignUP  loginpageOrSignUP;
	    private AmazonSciencePage amazonSciencePage;
	    private ReasearchAreasPage researchAreasPage;
	 
@Parameters("browser")
@BeforeTest
	public void launchBrowser(String browserName)
         {  System.out.println(browserName);
	    if (browserName.equals("Chrome"))
            {
             driver=openChromeBrowser();

             } 
	    
        if (browserName.equals("FireFox"))                   
            {
             driver =openFirefoxBrowser();

            }     
 	        driver.manage().window().maximize();

		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
	    
	    
	    
	@BeforeClass
	public void createPOMObject() {
		
	    loginpageOrSignUP =new LoginpageOrSignUP(driver);
	    amazonSciencePage=new AmazonSciencePage(driver);
	    researchAreasPage =new ReasearchAreasPage(driver);


	}
	
	
	@BeforeMethod 
	public void openAmazoneScienceAndReasearchAreaPage() {
		    driver.get("https://www.amazon.in");
		    loginpageOrSignUP.openAmazonScience();

		    
		    String amazonSciencePageURL=driver.getCurrentUrl();
		    Assert.assertEquals(amazonSciencePageURL, "https://www.amazon.science/","amazonSciencePageURL not match");
//		    if(amazonSciencePageURL.equals("https://www.amazon.science/")) {
//		    	System.out.println("AmazonScience URL is varified");
//		    	
//		    }
//		    else
//		    {
//		    	System.out.println("AmazonScience URL is wrong");
//
//		    }
		    
		    amazonSciencePage.clickResearchAreas();
		    String researchAreasPageURL=driver.getCurrentUrl();
		    Assert.assertEquals(researchAreasPageURL, "https://www.amazon.science/research-areas","researchAreasPageURLnot match");
//		    if(researchAreasPageURL.equals("https://www.amazon.science/")) {
//		    	System.out.println("researchAreasPageURL URL is varified");
//		    	
//		    }
//		    else
//		    {
//		    	System.out.println("researchAreasPageURL URL is wrong");

		    
		    
	       }
	
    @Test
    public void verifyDmodelingButton() {
    	 System.out.println("Test1");
   
    	 researchAreasPage.clickDmodeling();
    	 String url=driver.getCurrentUrl();{
 	    	System.out.println(url);
 	    }
 	    String title=driver.getTitle();{
 	    	System.out.println(title);
 	    }
 	    Assert.assertEquals(url, "https://www.amazon.science/tag/3d-modeling-imaging","researchAreasPage url not match");
 	    
// 	    if(url.equals("https://www.amazon.science/tag/3d-modeling-imaging")) {
// 	    	System.out.println("dmodeling URL is varified");
// 	    	
// 	    }
// 	    else
// 	    {
// 	    	System.out.println("dmodeling URL is wrong");

 	    }
		   
     @Test
     public void verifyAmazonRekognitionButton() {
		 System.out.println("Test2");
		
		 researchAreasPage.clickAmazonRekognition();
	     String researchareasurl=driver.getCurrentUrl();{
	    	System.out.println(researchareasurl);
	    }
	     Assert.assertEquals(researchareasurl, "https://www.amazon.science/tag/amazon-rekognition","researchareasurl not match");
	    
//	    if(researchareasurl.equals("https://www.amazon.science/tag/amazon-rekognition")) {
//	    	System.out.println("amazonRekognition URL is varified");
//	    	
//	    }
//	    else
//	         {
//	    	System.out.println("amazonRekognition URL is wrong");

	         }
		   
	   @AfterMethod 
	   public void logOutFromApp() {
			System.out.println("After Method");
			System.out.println("LOGOUT");
			}
	   @AfterClass
	   public void cleanPOMOObject() {
		   loginpageOrSignUP=null;
		   amazonSciencePage=null;
		   researchAreasPage=null;
		   researchAreasPage=null;
	   }
		   
   	 @AfterTest
	 public void closedBrowser() {
			System.out.println("After Class");
			driver.close();
			driver=null;
			System.gc();
			
			}
			
	
	

}
