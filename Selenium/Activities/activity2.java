package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.training-support.net");
	        System.out.println(driver.getTitle());
	       System.out.println(driver.findElement(By.id("about-link")));
	       
	       WebElement loc1= driver.findElement(By.className("ui inverted huge green button"));
	       System.out.println(loc1.getText());
	        
	        driver.findElement(By.cssSelector("#about-link"));
	        driver.findElement(By.linkText("About Us"));
	        driver.close();
	        

	}

}
