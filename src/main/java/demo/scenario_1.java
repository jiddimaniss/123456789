package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class scenario_1 {
	
	@Test 
	public void TC_001 () throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/)-%3EClose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='GO TO HOMEPAGE']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.className("_3704LK")).sendKeys("MOBILES");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		WebElement scroll_bar=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]"));  
        WebElement scroll_bar1=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        act.dragAndDropBy(scroll_bar, 50, 0).build().perform(); 
        Thread.sleep(2000);
        act.dragAndDropBy(scroll_bar1, -100, 0).build().perform();
      
       WebElement next= driver.findElement(By.xpath("//span[text()='Next']"));
        
        JavascriptExecutor js=(JavascriptExecutor)driver; 
                                                                     
    //   js.executeScript("arguments[0].scrollIntoView();", next);
        
        js.executeScript("arguments[0].click();", next);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", next);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", next);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", next);
        Thread.sleep(1000);
        js.executeScript("arguments[0].click();", next);
        
        
        
       WebElement check=driver.findElement(By.xpath("(//input[@type='checkbox'])[26]"));
       check.click();
        
        
        //contiune with further coding 
        
        
        
	}

}
