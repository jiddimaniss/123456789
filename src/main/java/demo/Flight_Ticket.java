package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flight_Ticket {
	WebDriver driver;
	@BeforeMethod
	public void bm() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void TC_001() throws InterruptedException {

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		
         driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("pune");
	 
	     driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
	     driver.findElement(By.xpath("//input[@id='toCity']")).click();
	     
	     driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bengaluru");
	     driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
	     
	     
	     driver.findElement(By.xpath("//label[@for='departure']")).click();
	   
	   WebElement month=driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
    
	    
	    
	}

}
