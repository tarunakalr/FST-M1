package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity12_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();	
		Actions builder = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get(" https://www.training-support.net/selenium/popups");
	    System.out.println(driver.getTitle());
	    WebElement button= driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
	    
	    builder.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
    	
        String tooltipText = button.getAttribute("data-tooltip");
	
        System.out.println("Tooltip text: " + tooltipText);
        button.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
    	
        
    	
        //Find username and pasword and fill in the details
	
        driver.findElement(By.id("username")).sendKeys("admin");
	
        driver.findElement(By.id("password")).sendKeys("password");
	
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
	
        
	
        
	
        String message = driver.findElement(By.id("action-confirmation")).getText();
	
        System.out.println(message);
	
        
	
        //Close browser
	
        driver.close();
        
        

	}

}
