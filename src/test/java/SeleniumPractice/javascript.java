package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javascript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.bbc.com/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.manage().window().maximize(); WebElement a =
		 * driver.findElement(By.xpath("//span[text()='More around the BBC']"));
		 * 
		  
		 * ex.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 * Thread.sleep(4000); ex.executeScript("window.scrollTo(0,0)");
		 * 
		 * 
		 */
		//JavascriptExecutor ex=(JavascriptExecutor)driver;
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("sachin",Keys.ENTER);
		//ex.executeScript("window.scrollTo(0,2000)");
		Actions s=new Actions(driver); 
		WebElement ele = driver.findElement(By.xpath("//span[text()='6 more images']"));
		s.scrollToElement(ele).perform();
	}

}
