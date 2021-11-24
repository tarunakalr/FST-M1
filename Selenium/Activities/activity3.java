package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity3 {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
	        driver.get("https://training-support.net/selenium/simple-form");
	        System.out.println(driver.getTitle());
	        
	        driver.findElement(By.id("firstName")).sendKeys("Taruna");
	        driver.findElement(By.id("lastName")).sendKeys("Kalra");
	        driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
	        driver.findElement(By.id("number")).sendKeys("9876689890");
	        driver.findElement(By.cssSelector(".ui.green.button")).click();
	        driver.close();
	        
	        
	        

	}

}
