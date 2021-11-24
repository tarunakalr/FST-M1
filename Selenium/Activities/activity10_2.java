package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		
		driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());
        
        driver.findElement(By.id("keyPressed"));
        
        
       actions.sendKeys("T").build().perform();
        
       actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
       driver.close();
        

	}

}
