package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aaa {

	WebDriver driver;
	@Test
	public void TC_001() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions o=new ChromeOptions();
		o.addArguments("−−incognito");
		DesiredCapabilities c = DesiredCapabilities.chrome();
		c.setCapability(ChromeOptions.CAPABILITY, o);
		driver=new ChromeDriver(o);
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
	}
}
