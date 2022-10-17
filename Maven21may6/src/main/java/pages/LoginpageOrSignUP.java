package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageOrSignUP{
	
	
	@FindBy(xpath="//input[@id='ap_email']")
	private	WebElement userName;

	@FindBy(xpath="//input[@id='continue']")
	private	WebElement usercontinue;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private	WebElement password;
	
	@FindBy(xpath="//input[@id='continue']")
	private	WebElement passcontinue;
	
	@FindBy(xpath="//a[text()='Amazon Science']")
	private WebElement amazonScience;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountAndList;
	

	@FindBy(xpath="//a[contains(@href,'https://www.abebooks.')]")
	private WebElement abeBooks;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement checkSearchBox;

	
	public LoginpageOrSignUP(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	public void senduserName() {
		userName.sendKeys("amolchitte36@gmail.com");
	}
	
	public void clickusercontinue() {
		usercontinue.click();
	}
	
	public void sendpassword() {
		password.sendKeys("7588619062");
	}
	
	public void clickpasscontinue() {
		passcontinue.click();
	   }
	
	public void openAmazonScience() {
		amazonScience.click();
	   }
	
	public void clickAccountAndList() {
		accountAndList.click();
	}
	

	public void openAbeBooks() {
		abeBooks.click();
	}
	
	
	
	
	//input[@name='field-keywords']
	//or
	public void loginpageOrSignUP() {
		userName.sendKeys("amolchitte36@gmail.com");
        usercontinue.click();
        password.sendKeys("7588619062");
        passcontinue.click();
        
        
        
	}   
	}        