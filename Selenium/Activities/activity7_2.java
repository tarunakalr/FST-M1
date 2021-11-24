package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity7_2 {

	public static void main(String[] args) {
		
			WebDriver driver = new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			driver.get("https://www.training-support.net/selenium/dynamic-attributes");
	        System.out.println(driver.getTitle());
	        driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
	        driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
	        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	        
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),"Welcome Back, admin"));
	        
	       
            String text= driver.findElement(By.id("action-confirmation")).getText();
	        
	        System.out.println(text);
	        
	        
	

	}

}
