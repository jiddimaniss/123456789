package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New_tab {
	
	WebDriver driver;
	@Test
	public void bm() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		 options.addArguments(" incognito");
//		 options.addArguments("new chrome");
//		 options.addArguments("new window");
		 
		driver=new ChromeDriver(options);
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
