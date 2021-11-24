package activities;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity11_4 {
public static void main(String[] args) {
	// handle;
    	
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Tittle of page is" + driver.getTitle());
        String parentWin= driver.getWindowHandle();
    	
        System.out.println(parentWin);
        driver.findElement(By.linkText("Click Me!")).click();
    	
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allWindowHandles = driver.getWindowHandles();
    	
        System.out.println("All window handles: " + allWindowHandles);
        
        //looping
        for (String handle : driver.getWindowHandles()) {
        	
            driver.switchTo().window(handle);
	
        }
        System.out.println("Current Handle " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("New Tab " + driver.getTitle());
        String newHeading = driver.findElement(By.cssSelector("div.content")).getText();
    	
        System.out.println("New Heading is " + newHeading);
        
        driver.findElement(By.linkText("Open Another One!")).click();
    	
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        allWindowHandles = driver.getWindowHandles();
    	
        System.out.println("All Handles" + allWindowHandles);
        for (String handle : driver.getWindowHandles()) {
        	
            driver.switchTo().window(handle);
	
        }
        System.out.println("New tab handle: " + driver.getWindowHandle());
    	
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("New Tab Title is: " + driver.getTitle());
   	
         newHeading = driver.findElement(By.cssSelector("div.content")).getText();
	
        System.out.println("New tab heading is: " + newHeading);
	
        driver.quit();
	
    }
	
}
        
        
    	
        


