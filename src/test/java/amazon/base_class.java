package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {
	WebDriver driver;
	@BeforeMethod
	public void bm() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver ();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
//	@AfterMethod	
//	public void am() {
//		driver.quit();
//	}

}
