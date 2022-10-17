package tempTestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginpageOrSignUP;
import pages.ShopArtBooksCollection;
import set_up.Base;



public class OpenAbeBookANdCheckBottons extends Base {
	private WebDriver driver;
	private LoginpageOrSignUP  loginpageOrSignUP;
	private ShopArtBooksCollection  shopArtBooksCollection;
	
	
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName) 
	
	
	{ if (browserName.equals("Chrome"))
	     {
		    driver=openChromeBrowser();

	      }  
	    if (browserName.equals("FireFox"))                   
	      {
	    	driver=openFirefoxBrowser();

		   }  
        driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@BeforeClass
	public void createPOMObject() {
	
		loginpageOrSignUP =new LoginpageOrSignUP(driver);
	    shopArtBooksCollection=new ShopArtBooksCollection(driver) ;

	}
	@BeforeMethod 
	public void openShopArtBooksCollection() {

       driver.get("https://www.amazon.in/");
       loginpageOrSignUP.openAbeBooks();
    
       String shopArtBooksCollectionURL=driver.getCurrentUrl();
       Assert.assertEquals(shopArtBooksCollectionURL,"https://www.abebooks.com/","shopArtBooksCollectionURL not match");
//       if(shopArtBooksCollectionURL.equals("https://www.abebooks.com/")) {
//    	System.out.println("shopArtBooksCollection URL is varified");
//    	
//         }
//       else
//         {
//    	System.out.println("shopArtBooksCollection  URL is wrong");
//
//         }
         
      
	}
    @Test
    public void verifyAdvancedSearchButton() {
    	 System.out.println("Test1");
   
    	 shopArtBooksCollection.clickAdvancedSearch();

         String advancedSearchurl=driver.getCurrentUrl();{
         System.out.println(advancedSearchurl);
            }
         String title=driver.getTitle();{
     	   System.out.println(title);
         }
         Assert.assertEquals(advancedSearchurl, "https://www.abebooks.com/servlet/SearchEntry?cm_sp=TopNav-_-Home-_-Advs","advancedSearchurl not match");
         Assert.assertEquals(title, "Book Search","title not match");
//        if(advancedSearchurl.equals("https://www.abebooks.com/servlet/SearchEntry?cm_sp=TopNav-_-Home-_-Advs")) {
//      	System.out.println("advancedSearch URL is varified");
//      	
//        }
//        else
//        {
//      	  System.out.println("dmodeling URL is wrong");
//        }
    }
		   
     @Test
     public void verifyRareBooksButton() {
		 System.out.println("Test2");
		
		  shopArtBooksCollection.clickRareBooks();
	      String clickRareBooksURL=driver.getCurrentUrl();{
	          System.out.println(clickRareBooksURL);
	       }
	      Assert.assertEquals(clickRareBooksURL ,"https://www.abebooks.com/books/rarebooks/?cm_sp=TopNav-_-Home-_-RBR","clickRareBooksURL not match ");
	    
//	      if(clickRareBooksURL.equals("https://www.abebooks.com/books/rarebooks/?cm_sp=TopNav-_-Advs-_-RBR")) {
//	    	System.out.println("clickRareBooksURL URL is varified");
//	    	
//	       }
//	      else
//	       {
//	    	System.out.println("clickRareBooksURL URL is wrong");

	    }
		   
	  @AfterMethod 
	  public void logOutFromApp() {
			System.out.println("After Method");
			System.out.println("LOGOUT");
			}
	  
	@AfterClass
	public void  cleanPOMObject()
	{
		loginpageOrSignUP=null ;
		shopArtBooksCollection=null;
	}
   	 @AfterTest
	 public void closedBrowser() {
			System.out.println("After Class");
			driver.close();
			driver=null;
			
			System.gc();
			
			}
       
       }
