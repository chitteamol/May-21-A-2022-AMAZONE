package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasearchAreasPage {

	@FindBy(xpath="(//a[text()='Applied Scientist- AWS AI'])[1]")
	private WebElement applyScientist;
	
	
	@FindBy(xpath="(//a[text()='3D modeling / imaging'])[1]")
	private WebElement dModeling;
	
	
	@FindBy(xpath="//a[text()='Amazon Rekognition']")
	private WebElement amazonRekognition;
	

	
	public ReasearchAreasPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void applyForScientist() {
		applyScientist.click();
	}
	
	public void clickAmazonRekognition() {
 	amazonRekognition.click();
         }
	
	public void clickDmodeling() {
	dModeling.click();
     }

	
	//or
	
	public void reasearchAreasPage() {
	amazonRekognition.click();
	dModeling.click();
	
	}	
	
}
