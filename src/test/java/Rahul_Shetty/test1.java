package Rahul_Shetty;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class test1 extends pom_base{
	
	
	@Test
	public void TC_001() throws InterruptedException {
		pom_element rahul=PageFactory.initElements(driver, pom_element.class);
		library_cls.custom_sendkey(rahul.send(), "abcd");
		Thread.sleep(2000);
		library_cls.custom_click(rahul.check());
		Thread.sleep(2000);
		library_cls.custom_click(rahul.radio());
	}

	
}
