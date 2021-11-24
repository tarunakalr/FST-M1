package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity6_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        
       WebElement obj1= driver.findElement(By.xpath("//input[@class='willDisappear']"));
       
      WebElement checkbox=  driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
      
      checkbox.click();
       
       wait.until(ExpectedConditions.invisibilityOf(obj1));
       
       checkbox.click();
       
       wait.until(ExpectedConditions.invisibilityOf(obj1));
       
      obj1.click();
      
      driver.close();
       
        
        

	}

}
