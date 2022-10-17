package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckSearchBox {
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement checkSearchBox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	public CheckSearchBox(WebDriver driver) {
		PageFactory.initElements (driver, this);
		}

	public void checkingSearchBox() {
		checkSearchBox.sendKeys("samsung foldable phone");
	}
	
	public void submitButton() {
	     submit.click();
	
	    // searchBox.click(); 
	
}
}