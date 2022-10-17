package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
		
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCartz;
	
	@FindBy(xpath="//input[@value='Proceed to checkout']")
	private WebElement proceedToCheckout;
	//input[@value='Proceed to checkout']
	
	public AddToCart(WebDriver driver) {
	      PageFactory.initElements(driver, this);
	}
	
	public void clickaddToCartz() {
	    addToCartz.click();
	}
	
	public void buyProceedToCheckout() {
		proceedToCheckout.click();
	}
	
	
}
