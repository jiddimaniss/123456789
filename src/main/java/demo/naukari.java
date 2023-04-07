package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class naukari {
	
	WebDriver driver;
	@BeforeMethod	
	public void bm() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void TC_001() throws InterruptedException {
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("santoshjiddimani1@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("santa@1011");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@href='/mnjuser/profile'])[1]")).click();
//		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
	//	driver.findElement(By.xpath(""));
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='collection']//li"));
		int size=list.size();
		System.out.println(size);
		
		for(int i=0;i<=size-1;i++) {
			String txt=list.get(i).getText();
			System.out.println(txt);
			if("Key Skills".equals(txt)) {
				list.get(i).click();
				break;
			}
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement key =driver.findElement(By.xpath("(//span[@class='edit icon'])[2]"));
	    js.executeScript("window.scrollBy(0,700)", "");
		
	    key.click();
	   driver.findElement(By.xpath(" (//a[@class='material-icons close'])[1]")).click();
	   
	   driver.findElement(By.xpath(" (//input[@type='text'])[4]")).sendKeys("Manual Testing");
	
//	  WebElement skill=driver.findElement(By.xpath("(//div[@tabindex='-1'])[1]"));
//       
//         act.moveToElement(skill);
  
       driver.findElement(By.xpath("//button[@type='button']")).click();  
	   
	}
	
	
	

//	@AfterMethod
//	public void am() {
//		driver.quit();
//	}
}
