package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement submit;
	
	@FindBy(xpath="//span(text()='span[Account & Lists']")
	private WebElement accAndList;

	@FindBy(xpath="//span[text()='Your Account']")
	private WebElement yourAcc;
	

	@FindBy(xpath="//span[text()='& Orders']")
	private WebElement andOrder;
	
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void sendsearchBox() {
		searchBox.sendKeys("Apple iphone 13");
	}
	
	public void submitButton() {
		submit.click();
	}
	
	public void accAndListClick() {
		accAndList.click();
		
	}
	
	public void yourAccClick() {
		yourAcc.click();
	}
	
	public void andOrderClick() {
		andOrder.click();
	}
	
	//or
	public void Homepage() {
		searchBox.sendKeys("Apple iphone 13");
		submit.click();
		accAndList.click();
		yourAcc.click();
		andOrder.click();

		
	}
	
	
	
	
	

	
	
}
