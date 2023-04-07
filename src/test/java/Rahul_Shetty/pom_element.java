package Rahul_Shetty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pom_element {
	

	
	@FindBy(how=How.XPATH,using="//input[@id='autocomplete']")
    private WebElement send;
	
	@FindBy(how=How.XPATH,using="//input[@value='radio3']")
	private WebElement radio;
	
	@FindBy(how=How.XPATH,using="//input[@value='option1']")
	private WebElement check;
	
	public WebElement send() {
		return send;
	}
	
	public WebElement radio() {
		return radio;
	}
	
	public WebElement check() {
		return check;
	}
}
