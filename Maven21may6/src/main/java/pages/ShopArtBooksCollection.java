package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopArtBooksCollection {
	
	@FindBy(xpath="//a[@title='Search millions of items for sale']")
	private WebElement advancedSearch;
	
	
	@FindBy(xpath="(//a[text()='Rare Books'])[1]")
	private WebElement rareBooks;
	
	public ShopArtBooksCollection(WebDriver driver) {
		PageFactory.initElements (driver, this);
		}
		
		
		public void clickAdvancedSearch() {
			advancedSearch.click();
		}
		
		public void clickRareBooks() {
			rareBooks.click();
		}
	//OR
	public void shopArtBooksCollection(){
		advancedSearch.click();
		rareBooks.click();
	}
	
}
