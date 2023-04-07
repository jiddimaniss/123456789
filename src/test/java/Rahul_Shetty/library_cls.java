package Rahul_Shetty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class library_cls {
	
	
	public static void custom_sendkey(WebElement element, String value) {
		
		try{
			element.sendKeys(value);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public static void custom_click(WebElement element) {
		
		try {
			element.click();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
