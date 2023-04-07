package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cls {
	
	@Test
	public void TC_001() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
	    WebElement news=driver.findElement(By.xpath("//div[@title='Cricket News']"));

		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement( news).build().perform();
		
		driver.findElement(By.xpath("//div[@title='Cricket Teams']")).click();
		
	}
	


}
