package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity11_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.id("prompt")).click();
	    Alert promtAlert = driver.switchTo().alert();
	    
	    String text = promtAlert.getText();
        System.out.println("Alert message is "+ text);
        
        promtAlert.sendKeys("okay");
        
        Thread.sleep(3000);
        
        promtAlert.accept();
        
        driver.close();
        
	    

	}

}
