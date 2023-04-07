package amazon;

import org.openqa.selenium.WebElement;

public class Library_cls {

	public static void custom_sendKeys (WebElement element ,String value) {
		try {
		element.sendKeys(value);
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void custom_cick(WebElement element) {
		try {
			element.click();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
}
