package amazon;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class test_class extends base_class{

	@Test
	public void TC_001 () {
		
		webelement amazon=PageFactory.initElements(driver,webelement.class);
		
		Library_cls.custom_sendKeys(amazon.search(), "iphone14");
		Library_cls.custom_cick(amazon.phone());
	}
}
