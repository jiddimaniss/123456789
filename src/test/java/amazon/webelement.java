package amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class webelement {

	@FindBy(how=How.XPATH,using="//input[@id='twotabsearchtextbox']")
	private WebElement search;
	
	@FindBy(how=How.XPATH,using="(//div[@class='s-suggestion-container'])[2]")
	private WebElement iphone;
	
//	@FindBy(how=How.XPATH,using="")
//	private WebElement 
	
	public WebElement search() {
		return search;
	}
	
	public WebElement phone() {
		return iphone;
	}
	
}
