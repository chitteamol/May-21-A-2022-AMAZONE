package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSciencePage {
	
	@FindBy(xpath="(//a[text()='Research areas'])[2]")
	private WebElement researchAreas;
	
//	@FindBy(xpath="(//a[text()='3D modeling / imaging'])[1]")
//	private WebElement dModeling;
	
	@FindBy(xpath="(//a[text()='News and features'])[2]")
	private WebElement newsAndFeatures;
//	
//	@FindBy(xpath="//a[text()='Amazon Rekognition']")
//	private WebElement amazonRekognition;
	
	public AmazonSciencePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickResearchAreas() {
		researchAreas.click();
	}
//	public void clickDmodeling() {
//		dModeling.click();
//	}
	
//	public void clickAmazonRekognition() {
//		amazonRekognition.click();
//	}
	
	public void clickNewsAndFeatures() {
		newsAndFeatures.click();
	}
	
	//or
	public void amazonSciencePage() {
		researchAreas.click();
//		dModeling.click();
		newsAndFeatures.click();
//		amazonRekognition.click();
	
	

    }
}