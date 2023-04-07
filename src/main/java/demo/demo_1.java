package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_1 {

	WebDriver driver;
	@BeforeMethod
	public void openbrowser1() {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void TC_100() throws InterruptedException  {
		
//		WebDriverWait wb=new WebDriverWait(driver, 60);
//		wb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://pps.whatsapp.net/v/t61.24694-24/299413670_437740108288695_3845355136217638344_n.jpg?stp=dst-jpg_s96x96&ccb=11-4&oh=01_AdQy9IcsgYQu3WiDqFRWHODcjCNrf7tRdOYjf4hJXJD-bg&oe=6430DE35']")));
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w']")).sendKeys("8788");
		
		driver.findElement(By.xpath("//span[@title='Vishal Chavn']")).click();
		
		String[] arr1= {"Be positive","I am Bot","Stay Strong","Do HArd work","Automated Bot"};
		
		for(int j=0; j<75; j++) 
		{
		    for(int i=0; i<arr1.length; i++)
		    {
			
			    try{
				
				 WebElement textbox=driver.findElement(By.xpath("(//p[@class='selectable-text copyable-text iq0m558w'])[2]"));
				 textbox.sendKeys(arr1[i]);
				 driver.findElement(By.xpath("//div[@class='_2xy_p _3XKXx']")).click();
				
			    }catch(Exception e) {
				
				 System.out.println(e);
				
			    }
		    }
		}
		
	}

	@AfterMethod
	public void closebrowser1() throws InterruptedException {
		
		//logout and close the driver
		
//		driver.findElement(By.xpath("//span[@data-testid='menu']")).click();
//		
//		driver.findElement(By.xpath("//div[text()='Log out']")).click();
//		
//		driver.findElement(By.xpath("//div[@class='_1M6AF _3QJHf']")).click();
//		
//		Thread.sleep(2000);
//		driver.quit();
		
		
	}
	
}
