package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWIndowChildBrowser {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		/*
		 * WebElement ele =
		 * driver.findElement(By.xpath("//button[@id='login-google-button']"));
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("document.getElementById('login-google-button').click()");
		 * js.executeScript("arguments[0].click();", ele);
		 */
		WebElement a = driver.findElement(By.xpath("//input[@id='ifl-InputFormField-ihl-useId-passport-webapp-1']"));
		Actions s=new Actions(driver);
		s.sendKeys(Keys.ENTER).sendKeys("sachin").perform();
	}
}
